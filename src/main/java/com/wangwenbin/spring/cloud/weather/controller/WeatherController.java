package com.wangwenbin.spring.cloud.weather.controller;

import com.wangwenbin.spring.cloud.weather.service.WeatherService;
import com.wangwenbin.spring.cloud.weather.utils.GetRequestUtils;
import com.wangwenbin.spring.cloud.weather.vo.WeatherResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 声明此类是一个controller
 * */
@SuppressWarnings("all")
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    /**
     * 获取当前位置的天气
     * */
    @PostMapping("/queryWeatherDayByIp")
    public String queryWeatherDay(HttpServletRequest request, HttpServletResponse response){
        String result = null;
        try {
            String ip = GetRequestUtils.calcIp(request);
            result = weatherService.queryWeatherDay(ip);
        }catch (Exception e){
            e.printStackTrace();;
        }
        return result;
    }

    /**
     * 获取当前位置的天气
     * */
    @PostMapping("/queryWeatherDayByCity")
    public String queryWeatherDayByCity(HttpServletRequest request, HttpServletResponse response,String city){
        String result = null;
        try {
            result = weatherService.queryWeatherDay(city);
        }catch (Exception e){
            e.printStackTrace();;
        }
        return result;
    }
}
