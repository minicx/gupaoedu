package com.xcao.delegate.courier;

/**
 * @Auther: minicx
 * @Date: 18-10-11 13:50
 * @Description:
 */
public class SFCompany implements Company {
    @Override
    public void delivery() {
        System.out.println("顺丰去发快递");
    }
}
