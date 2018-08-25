package com.wangwenbin.spring.cloud.weather.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 接口返回实体类
 * */
public class WeatherResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private WeatherLocation weatherLocation;
    private List<WeatherDaily> weatherDailys;
    public void setWeatherLocation(WeatherLocation weatherLocation) {
        this.weatherLocation = weatherLocation;
    }
    public void setWeatherDailys(List<WeatherDaily> weatherDailys) {
        this.weatherDailys = weatherDailys;
    }
    public WeatherLocation getWeatherLocation() {
        return weatherLocation;
    }
    public List<WeatherDaily> getWeatherDailys() {
        return weatherDailys;
    }
}
