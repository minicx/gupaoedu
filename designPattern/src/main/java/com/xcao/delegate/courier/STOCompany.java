package com.xcao.delegate.courier;

/**
 * @Auther: minicx
 * @Date: 18-10-11 13:50
 * @Description:
 */
public class STOCompany implements Company {
    @Override
    public void delivery() {
        System.out.println("申通去发快递");
    }
}
