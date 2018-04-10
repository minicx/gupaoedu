package com.gupaoedu.mybatis.newlife.v1;

/**
 * Created by James on 2018-03-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public interface GPExecutor {
    <T> T query(String statement, String parameter);
}
