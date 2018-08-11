package com.xcao.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:caoxiang
 * @Description:
 * @Date: Create in 10:42 2018/8/11
 * @Modified By;
 */
public class AdModelTest {

    public static void main(String[] args) {
        AdModel adModel = new AdModel();
        System.out.println(adModel);

        List list = new ArrayList<>();
        list.add("123");
        adModel.setAdPicutres(list);
        System.out.println(adModel.getAdPicutres());
        AdModel adModel2 =  adModel.clone();
        System.out.println(adModel2);
        System.out.println(adModel2.getAdPicutres());
        AdModel adModel3 =  adModel.clone();
        System.out.println(adModel3);
        System.out.println(adModel3.getAdPicutres());
    }
}