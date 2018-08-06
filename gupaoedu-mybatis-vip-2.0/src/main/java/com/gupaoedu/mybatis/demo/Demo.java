package com.gupaoedu.mybatis.demo;

import com.gupaoedu.mybatis.beans.Test;
import com.gupaoedu.mybatis.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by James on 2017-09-08.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class Demo {
    public static SqlSession getSqlSession() throws FileNotFoundException {
        //配置文件
        InputStream configFile = new FileInputStream(
                "F:\\github\\gupaoedu\\gupaoedu-mybatis-vip-2.0\\src\\main\\java\\com\\gupaoedu\\mybatis\\demo\\mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configFile);
        //加载配置文件得到SqlSessionFactory
        return sqlSessionFactory.openSession();
    }

    public static void main(String[] args) throws FileNotFoundException {
        TestMapper testMapper = getSqlSession().getMapper(TestMapper.class);
        Test test = testMapper.selectByPrimaryKey(1);
        /**
         * 1. 找到SQL
         * 2. 参数设置
         * 3. 执行
         * 4. 结果映射
         */

        System.out.println(test);
    }
}
