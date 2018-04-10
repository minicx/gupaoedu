package com.gupaoedu.mybatis.gp.plugin;

import org.apache.ibatis.plugin.Interceptor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: xcao
 * @Description:
 * @Date:Create in 15:32 2018/4/10
 * @Modified By:
 */
public class MyInterceptorChain {

    private final List<Interceptor> interceptors = new ArrayList<Interceptor>();

    public Object pluginAll(Object target) {
        for (Interceptor interceptor : interceptors) {
            target = interceptor.plugin(target);
        }
        return target;
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public List<Interceptor> getInterceptors() {
        return Collections.unmodifiableList(interceptors);
    }
}
