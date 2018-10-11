package com.xcao.strategy.arithmetic;

import java.math.BigDecimal;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:01
 * @Description:
 */
public class Subtraction implements Arithmetic {
    @Override
    public double doArithmetic(double x, double y) {
        return new BigDecimal(Double.toString(x)).subtract(new BigDecimal(Double.toString(y))).doubleValue();
    }
}
