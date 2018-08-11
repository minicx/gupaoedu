package com.xcao.singleton;

/**
 * @Author:caoxiang
 * @Description: 单例模式
 * @Date: Create in 9:36 2018/8/11
 * @Modified By;
 */
public class Singleton {

    public static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton () {
        return singleton;
    }
}