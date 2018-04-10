package com.gupaoedu.mybatis.newlife.v1;

import com.gupaoedu.mybatis.beans.Test;
/**
 * Created by James on 2018-04-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class Entry {
    public static void main(String[] args) {
        GPSqlSession sqlSession = new GPSqlSession(new GPConfiguration(),
                new GPSimpleExecutor());
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        Test test =  mapper.selectByPrimaryKey(1);
        System.out.println(test);
    }
}
