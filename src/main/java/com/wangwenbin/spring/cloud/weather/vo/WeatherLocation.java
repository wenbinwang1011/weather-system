package com.wangwenbin.spring.cloud.weather.vo;

import java.io.Serializable;

/**
 * 返回地址实体类
 * */
public class WeatherLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 城市id
     * */
    private String id;
    /**
     * 城市名称
     * */
    private String name;
    private String country;
    private String path;
    private String timezone;
    private String timezoneOffset;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getPath() {
        return path;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getTimezoneOffset() {
        return timezoneOffset;
    }
}
