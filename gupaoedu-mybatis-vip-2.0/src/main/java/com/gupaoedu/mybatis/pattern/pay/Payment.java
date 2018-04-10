package com.gupaoedu.mybatis.pattern.pay;

/**
 * Created by James on 2018-01-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public interface Payment {
    /**
     * 支付
     * @param request
     * @return
     */
    PayResponse pay(PayRequest request);
}
