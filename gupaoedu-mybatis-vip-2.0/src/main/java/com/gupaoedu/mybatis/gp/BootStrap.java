package com.gupaoedu.mybatis.gp;

import com.gupaoedu.mybatis.beans.Test;
import com.gupaoedu.mybatis.gp.config.GpConfiguration;
import com.gupaoedu.mybatis.gp.executor.ExecutorFactory;
import com.gupaoedu.mybatis.gp.session.GpSqlSession;
import com.gupaoedu.mybatis.my.TestMapper;

import java.io.IOException;

/**
 * Created by James on 2017-07-05.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class BootStrap {
    public static void main(String[] args) throws Exception {
        start();
    }

    private static void start() throws Exception {
        GpConfiguration configuration = new GpConfiguration();
        configuration.setScanPath("com.gupaoedu.mybatis.gp.config.mappers");
        configuration.build();
        GpSqlSession sqlSession = new GpSqlSession(configuration,
                ExecutorFactory.get(ExecutorFactory.ExecutorType.SIMPLE.name(),configuration));
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        long start = System.currentTimeMillis();
        Test test = testMapper.selectByPrimaryKey(1);
        System.out.println(test);
        System.out.println("cost:"+ (System.currentTimeMillis() -start));
    }
}
