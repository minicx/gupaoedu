package com.gupaoedu.mybatis.gp.plugin;

import com.gupaoedu.mybatis.my.SimpleExecutor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Proxy;
import org.apache.ibatis.plugin.PluginException;
import org.apache.ibatis.plugin.Signature;

/**
 * @Author: xcao
 * @Description:
 * @Date:Create in 17:07 2018/4/10
 * @Modified By:
 */
public class MyPlugin  implements InvocationHandler {

    private MyInterceptor interceptor;

    private Object object;

    private Map<Class<?>, Set<Method>> signatureMap;

    public MyPlugin(Object object, MyInterceptor interceptor, Map<Class<?>, Set<Method>> signatureMap) {
        this.interceptor = interceptor;
        this.object = object;
        this.signatureMap = signatureMap;
    }

    public static Object wrap(Object target, MyInterceptor interceptor) {
        Map<Class<?>, Set<Method>> signatureMap = getSignatureMap(interceptor);
        Class<?> type = target.getClass();
        Class<?>[] interfaces = getAllInterfaces(type, signatureMap);
        return interfaces.length > 0 ? Proxy.newProxyInstance(type.getClassLoader(), interfaces, new MyPlugin(target, interceptor, signatureMap)) : target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Set<Method> methods = this.signatureMap.get(method.getDeclaringClass());
        return methods != null && methods.contains(method) ? this.interceptor.intercept(new MyInvocation(this.object, method, args)) : method.invoke(this.object, args);
    }

    private static Map<Class<?>, Set<Method>> getSignatureMap(MyInterceptor interceptor) {
        PluginAnnotation interceptsAnnotation = (PluginAnnotation)interceptor.getClass().getAnnotation(PluginAnnotation.class);
        if (interceptsAnnotation == null) {
            throw new PluginException("No @Intercepts annotation was found in interceptor " + interceptor.getClass().getName());
        } else {
            Signature[] sigs = interceptsAnnotation.value();
            Map<Class<?>, Set<Method>> signatureMap = new HashMap();
            Signature[] var4 = sigs;
            int var5 = sigs.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Signature sig = var4[var6];
                Set<Method> methods = (Set)signatureMap.get(sig.type());
                if (methods == null) {
                    methods = new HashSet();
                    signatureMap.put(sig.type(), methods);
                }

                try {
                    Method method = sig.type().getMethod(sig.method(), sig.args());
                    ((Set)methods).add(method);
                } catch (NoSuchMethodException var10) {
                    throw new PluginException("Could not find method on " + sig.type() + " named " + sig.method() + ". Cause: " + var10, var10);
                }
            }

            return signatureMap;
        }
    }

    private static Class<?>[] getAllInterfaces(Class<?> type, Map<Class<?>, Set<Method>> signatureMap) {
        HashSet interfaces;
        for(interfaces = new HashSet(); type != null; type = type.getSuperclass()) {
            Class[] var3 = type.getInterfaces();
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Class<?> c = var3[var5];
                if (signatureMap.containsKey(c)) {
                    interfaces.add(c);
                }
            }
        }

        return (Class[])interfaces.toArray(new Class[interfaces.size()]);
    }
}
