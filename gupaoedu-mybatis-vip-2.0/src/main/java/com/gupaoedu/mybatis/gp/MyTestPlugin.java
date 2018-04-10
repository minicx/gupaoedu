package com.gupaoedu.mybatis.gp;

import com.gupaoedu.mybatis.gp.executor.Executor;
import com.gupaoedu.mybatis.gp.plugin.MyInterceptor;
import com.gupaoedu.mybatis.gp.plugin.MyInvocation;
import com.gupaoedu.mybatis.gp.plugin.MyPlugin;
import com.gupaoedu.mybatis.gp.plugin.PluginAnnotation;
import org.apache.ibatis.plugin.Signature;
import com.gupaoedu.mybatis.gp.config.MapperRegistory;
import com.gupaoedu.mybatis.gp.config.MapperRegistory.MapperData;

/**
 * @Author: xcao
 * @Description:
 * @Date:Create in 17:04 2018/4/10
 * @Modified By:
 */
@PluginAnnotation({@Signature(type = Executor.class,
        method = "query",
        args = {MapperData.class, Object.class})})
public class MyTestPlugin implements MyInterceptor {
    @Override
    public Object intercept(MyInvocation invocation) throws Throwable {
//        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
//        BoundSql boundSql = mappedStatement.getBoundSql(invocation.getArgs()[1]);
//        System.out.println(String.format("plugin output sql = %s , param=%s", boundSql.getSql(),boundSql.getParameterObject()));
        System.out.println(invocation);
        System.out.println("==============");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        System.out.println("------------");
        return MyPlugin.wrap(target, this);
    }
}
