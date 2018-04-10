package com.gupaoedu.mybatis.newlife.v1;

/**
 * Created by James on 2018-03-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class GPSqlSession {
        private GPConfiguration configuration;
        private GPExecutor executor;

        public GPSqlSession(GPConfiguration configuration, GPExecutor executor) {
            this.configuration = configuration;
            this.executor = executor;
        }

    /**
     * getMapper
     * @param clazz
     */
    public <T> T getMapper(Class<T> clazz){
       return configuration.getMapper(clazz,this);
    }

    /**
     *
     * @param statement sql 语句
     * @param parameter sql 参数
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statement,String parameter){
        return executor.query(statement,parameter);
    }

}
