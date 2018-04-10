package com.gupaoedu.mybatis.gp;

import com.gupaoedu.mybatis.gp.plugin.MyInterceptor;
import com.gupaoedu.mybatis.gp.plugin.MyInvocation;

/**
 * @Author: xcao
 * @Description:
 * @Date:Create in 17:04 2018/4/10
 * @Modified By:
 */
public class MyTestPlugin implements MyInterceptor {
    @Override
    public Object intercept(MyInvocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        BoundSql boundSql = mappedStatement.getBoundSql(invocation.getArgs()[1]);
        System.out.println(String.format("plugin output sql = %s , param=%s", boundSql.getSql(),boundSql.getParameterObject()));
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
}
