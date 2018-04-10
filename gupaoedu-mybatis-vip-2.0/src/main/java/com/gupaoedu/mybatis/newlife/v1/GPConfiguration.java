package com.gupaoedu.mybatis.newlife.v1;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by James on 2018-03-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class GPConfiguration {
    public <T> T getMapper(Class<T> clazz, GPSqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},
                new GPMapperProxy(sqlSession));
    }

    /**
     * xml解析好了
     */
    static class TestMapperXml{
        public static final String namespace = "com.gupaoedu.mybatis.newlife.v1.TestMapper";

        public static final Map<String,String> methodSqlMapping = new HashMap<>();

        static {
            methodSqlMapping.put("selectByPrimaryKey","select * from test where id =%d");
        }
    }
}
