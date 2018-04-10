package com.gupaoedu.mybatis.gp.plugin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: xcao
 * @Description:
 * @Date:Create in 17:00 2018/4/10
 * @Modified By:
 */
public class MyInvocation {

    private Object target;
    private Method method;
    private Object[] args;

    public MyInvocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Object getTarget() {
        return target;
    }

    public Method getMethod() {
        return method;
    }

    public Object[] getArgs() {
        return args;
    }

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, args);
    }
}
