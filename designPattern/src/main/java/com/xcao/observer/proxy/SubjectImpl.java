package com.xcao.observer.proxy;

/**
 * @Auther: minicx
 * @Date: 18-10-11 17:41
 * @Description:
 */
public class SubjectImpl implements Subject {
    @Override
    public void add() {
        System.out.println("add==========");
    }

    @Override
    public void remove() {
        System.out.println("remove==========");
    }
}
