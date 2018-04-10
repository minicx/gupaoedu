package com.gupaoedu.mybatis.pattern.pay;

/**
 * Created by James on 2018-03-31.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class Boostrap {
    public static void main(String[] args) {
        Payment pay =  PaymentFactory.get();//get  if 大类  国内  国外  --》 wei ali
         pay.pay(new PayRequest());
    }
}
