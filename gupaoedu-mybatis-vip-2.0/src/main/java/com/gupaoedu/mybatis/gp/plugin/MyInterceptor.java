package com.gupaoedu.mybatis.gp.plugin;

/**
 * @Author: xcao
 * @Description:
 * @Date:Create in 16:59 2018/4/10
 * @Modified By:
 */
public interface MyInterceptor {

    Object intercept(MyInvocation invocation) throws Throwable;

    Object plugin(Object target);

//    void setProperties(Properties properties);
}
