package com.xcao.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:caoxiang
 * @Description:广告模板
 * @Date: Create in 10:32 2018/8/11
 * @Modified By;
 */
public class AdModel implements Cloneable {

    // 广告id
    private String adId;

    // 广告主
    private String adOwner;

    // 行业类目
    private String adIndustryCategory;

    //  图片
    private List<String> adPicutres;

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getAdOwner() {
        return adOwner;
    }

    public void setAdOwner(String adOwner) {
        this.adOwner = adOwner;
    }

    public String getAdIndustryCategory() {
        return adIndustryCategory;
    }

    public void setAdIndustryCategory(String adIndustryCategory) {
        this.adIndustryCategory = adIndustryCategory;
    }

    public List<String> getAdPicutres() {
        return adPicutres;
    }

    public void setAdPicutres(List<String> adPicutres) {
        this.adPicutres = adPicutres;
    }
    @Override
    public AdModel clone() {

        AdModel adModel = null;

        try {
            adModel = (AdModel)super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        adModel.setAdPicutres(new ArrayList<>());

        return adModel;
    }
}