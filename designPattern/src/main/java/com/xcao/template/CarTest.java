package com.xcao.template;

import com.xcao.template.template.BenzCar;
import com.xcao.template.template.Car;
import com.xcao.template.template.VolkswagenCar;

/**
 * @Auther: minicx
 * @Date: 18-10-11 11:36
 * @Description:
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new BenzCar();
        car.drive();

        Car car2 = new VolkswagenCar();
        car2.drive();
    }
}
