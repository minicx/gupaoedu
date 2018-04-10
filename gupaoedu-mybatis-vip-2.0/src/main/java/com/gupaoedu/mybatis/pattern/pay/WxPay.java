package com.gupaoedu.mybatis.pattern.pay;

/**
 * Created by James on 2018-03-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class WxPay extends AbstractBasePayment {
    @Override
    public PayResponse pay(PayRequest request) {
        return null;
    }

    @Override
    protected void postPay() {

    }

    @Override
    protected void prePay() {

    }
}
