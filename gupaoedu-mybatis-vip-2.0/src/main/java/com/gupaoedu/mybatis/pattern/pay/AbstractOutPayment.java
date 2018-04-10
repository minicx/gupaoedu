package com.gupaoedu.mybatis.pattern.pay;

/**
 * Created by James on 2018-01-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */

/**
 * 支付很多标准动作
 */

//国外pay
public abstract class AbstractOutPayment implements Payment{

    public void payment(){
//        log.info("国外");
        //1.准备参数 校验参数
        prePay();
        pay(new PayRequest());
        postPay();
    }

    protected abstract void postPay();

    protected abstract void prePay();
}
