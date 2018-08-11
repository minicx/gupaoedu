package com.xcao.singleton;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 9:45 2018/8/11
 * @Modified By;
 */
public class SingletonInnerTest {
    public static void main(String[] args) {
        System.out.println(SingletonInner.getSingleton());
        System.out.println(SingletonInner.getSingleton());
        System.out.println(SingletonInner.getSingleton());
        System.out.println(SingletonInner.getSingleton());
    }
}