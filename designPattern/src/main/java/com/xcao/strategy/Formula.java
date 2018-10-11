package com.xcao.strategy;

import com.xcao.strategy.arithmetic.Arithmetic;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:09
 * @Description:
 */
public class Formula {
    private double x;
    private double y;

    public void doFormula(Arithmetic arithmetic) {
        System.out.println(arithmetic.doArithmetic(x, y));
    }

    public Formula(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Formula{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
