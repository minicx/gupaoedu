package com.gupaoedu.mybatis.gp.plugin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

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

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
