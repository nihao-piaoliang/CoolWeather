package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    int id;
    String countrName;
    String weatherId;
    int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountrName() {
        return countrName;
    }

    public void setCountrName(String countrName) {
        this.countrName = countrName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
