package com.xcao.singleton;

/**
 * @Author:caoxiang
 * @Description: 单例模式
 * @Date: Create in 9:36 2018/8/11
 * @Modified By;
 */
public class SingletonInner {

    private SingletonInner() {

    }

    private static class SingletonInnerCreator  {
        private static SingletonInner singletonInner = new SingletonInner();
    }

    public static SingletonInner getSingleton () {
        return SingletonInnerCreator.singletonInner;
    }
}