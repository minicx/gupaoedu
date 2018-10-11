package com.xcao.strategy;

import com.xcao.strategy.arithmetic.Addition;
import com.xcao.strategy.arithmetic.Division;
import com.xcao.strategy.arithmetic.Multiplication;
import com.xcao.strategy.arithmetic.Subtraction;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:00
 * @Description: 浮点数加减乘除的策略
 */
public class ArithmeticTest {
    public static void main(String[] args) {
        Formula formula = new Formula(1.1, 2.2);
        formula.doFormula(new Addition());
        formula.doFormula(new Division());
        formula.doFormula(new Multiplication());
        formula.doFormula(new Subtraction());
    }
}
