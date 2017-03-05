package com.niceshao.viewpagetest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by niceshao on 17-2-21.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityeCode;
    private int provinceId;

    public int getCityeCode() {
        return cityeCode;
    }

    public void setCityeCode(int cityeCode) {
        this.cityeCode = cityeCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
