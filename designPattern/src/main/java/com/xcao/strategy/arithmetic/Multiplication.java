package com.xcao.strategy.arithmetic;

import java.math.BigDecimal;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:06
 * @Description:
 */
public class Multiplication implements Arithmetic {
    @Override
    public double doArithmetic(double x, double y) {
        return new BigDecimal(Double.toString(x)).multiply(new BigDecimal(Double.toString(y))).doubleValue();
    }
}
