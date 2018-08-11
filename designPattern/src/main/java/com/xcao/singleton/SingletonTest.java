package com.xcao.singleton;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 9:38 2018/8/11
 * @Modified By;
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
        System.out.println(Singleton.getSingleton());
    }
}