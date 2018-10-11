package com.xcao.template.template;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:33
 * @Description:
 */
public class BenzCar extends Car {
    @Override
    protected void start() {
        System.out.println(this.getClass() + "start");
    }

    @Override
    protected void move() {
        System.out.println(this.getClass() + "move");
    }

    @Override
    protected void stop() {
        System.out.println(this.getClass() + "stop");
    }
}
