package com.xcao.delegate;

/**
 * @Auther: minicx
 * @Date: 18-10-11 13:41
 * @Description: 发快递，通过一个代理点去向不同的快递公司发快递
 */
public class Delegater {
    public static void main(String[] args) {
        new Deliverier().doing("申通");
    }
}
