package com.gupaoedu.mybatis.newlife.v1;

import com.gupaoedu.mybatis.beans.Test;

/**
 * Created by James on 2018-04-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public interface TestMapper {
    Test selectByPrimaryKey(Integer userId);
}
