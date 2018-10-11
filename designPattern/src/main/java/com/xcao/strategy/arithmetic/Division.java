package com.xcao.strategy.arithmetic;

import java.math.BigDecimal;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:06
 * @Description:
 */
public class Division implements Arithmetic {
    @Override
    public double doArithmetic(double x, double y) {
        return new BigDecimal(Double.toString(x)).divide(new BigDecimal(Double.toString(y))).doubleValue();
    }
}
