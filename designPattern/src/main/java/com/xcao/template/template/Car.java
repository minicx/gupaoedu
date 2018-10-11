package com.xcao.template.template;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:32
 * @Description:
 */
public abstract class Car {

    public void drive() {
        start();
        move();
        stop();
    }

    protected abstract void start();

    protected abstract void move();

    protected abstract void stop();
}
