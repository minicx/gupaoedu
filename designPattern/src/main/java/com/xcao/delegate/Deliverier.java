package com.xcao.delegate;

import com.xcao.delegate.courier.SFCompany;
import com.xcao.delegate.courier.STOCompany;

/**
 * @Auther: minicx
 * @Date: 18-10-11 13:44
 * @Description:
 */
public class Deliverier {
    public void doing (String company) {
        switch (company) {
            case "申通":
                new STOCompany().delivery();
                break;
            case "顺丰":
                new SFCompany().delivery();
                break;
        }
    }

}
