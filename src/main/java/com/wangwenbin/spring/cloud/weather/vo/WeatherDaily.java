package com.wangwenbin.spring.cloud.weather.vo;

import java.io.Serializable;

/**
 * 天气详情
 * */
public class WeatherDaily implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 日期
     * */
    private String date;
    /**
     * 白天天气现象文字
     * */
    private String textDay;
    /**
     * 白天天气现象代码
     * */
    private String  codeDay;
    /**
     * 晚间天气现象文字
     */
    private String textNight;
    /**
     * 晚间天气现象代码
     */
     private String codeNight;
    /**
     *当天最高温度
     */
      private Integer high;
    /**
     * 当天最低温度
     */
     private Integer low;
     /**
      * 降水概率，范围0~100，单位百分比
      * */
     private Integer precip;
     /**
      * 风向文字
      * */
      private String windDirection;
      /**
       * 风向角度
       * */
      private Integer windDirectionDegree;
    /**
     * 风速，单位km/h
     */
    private Integer windSpeed;
    /**
     *风力
     */
    private Integer windScale;

    public void setDate(String date) {
        this.date = date;
    }

    public void setTextDay(String textDay) {
        this.textDay = textDay;
    }

    public void setCodeDay(String codeDay) {
        this.codeDay = codeDay;
    }

    public void setTextNight(String textNight) {
        this.textNight = textNight;
    }

    public void setCodeNight(String codeNight) {
        this.codeNight = codeNight;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public void setWindDirectionDegree(Integer windDirectionDegree) {
        this.windDirectionDegree = windDirectionDegree;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setWindScale(Integer windScale) {
        this.windScale = windScale;
    }

    public String getDate() {

        return date;
    }

    public String getTextDay() {
        return textDay;
    }

    public String getCodeDay() {
        return codeDay;
    }

    public String getTextNight() {
        return textNight;
    }

    public String getCodeNight() {
        return codeNight;
    }

    public Integer getHigh() {
        return high;
    }

    public Integer getLow() {
        return low;
    }

    public Integer getPrecip() {
        return precip;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public Integer getWindDirectionDegree() {
        return windDirectionDegree;
    }

    @Override
    public String toString() {
        return "WeatherDaily{" +
                "date='" + date + '\'' +
                ", textDay='" + textDay + '\'' +
                ", codeDay='" + codeDay + '\'' +
                ", textNight='" + textNight + '\'' +
                ", codeNight='" + codeNight + '\'' +
                ", high=" + high +
                ", low=" + low +
                ", precip=" + precip +
                ", windDirection='" + windDirection + '\'' +
                ", windDirectionDegree=" + windDirectionDegree +
                ", windSpeed=" + windSpeed +
                ", windScale=" + windScale +
                '}';
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public Integer getWindScale() {
        return windScale;
    }
}
