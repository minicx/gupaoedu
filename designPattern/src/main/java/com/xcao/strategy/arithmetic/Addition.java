package com.xcao.strategy.arithmetic;

import java.math.BigDecimal;

/**
 * @Auther: minicx
 * @Date: 18-10-11 10:59
 * @Description:
 */
public class Addition implements Arithmetic {

    @Override
    public double doArithmetic(double x, double y) {
        return new BigDecimal(Double.toString(x)).add(new BigDecimal(Double.toString(y))).doubleValue();
    }
}
