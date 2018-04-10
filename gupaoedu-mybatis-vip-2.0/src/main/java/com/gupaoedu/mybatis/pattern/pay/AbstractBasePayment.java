package com.gupaoedu.mybatis.pattern.pay;

/**
 * Created by James on 2018-01-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */

/**
 * 国内支付很多标准动作
 */
public abstract class AbstractBasePayment implements Payment{

    public void payment(){
//        log.info("国内");
        //1.准备参数 校验参数
        prePay();
        //2.pay
        pay(new PayRequest());
        //3.记录
        postPay();
    }

    protected abstract void postPay();

    protected abstract void prePay();
}
