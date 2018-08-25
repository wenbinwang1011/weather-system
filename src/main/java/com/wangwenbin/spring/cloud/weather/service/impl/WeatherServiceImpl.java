package com.wangwenbin.spring.cloud.weather.service.impl;

import com.wangwenbin.spring.cloud.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.TimeoutUtils;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("all")
@Service
public class WeatherServiceImpl implements WeatherService {
    private final String KEY = "vxopva5yfpk8oi3p";
    private final String WEATHER_URL = "https://api.seniverse.com/v3/weather/daily.json?";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //查询天气
    @Override
    public String queryWeatherDay(String parameter) throws Exception{
        //redis
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        if(stringRedisTemplate.hasKey("WEATHER_DETAIL_"+parameter)){
            String redisResult = ops.get("WEATHER_DETAIL_" + parameter);
            return redisResult;
        }
        String queryWeatherDayUrl = WEATHER_URL + "key="+KEY+"&location="+parameter+"&language=zh-Hans&unit=c&start=-1";
        //发起请求get
        ResponseEntity<String> resultString = restTemplate.getForEntity(queryWeatherDayUrl, String.class);
        if(resultString.getStatusCodeValue() != 200){
            throw new Exception("连接超时,请重试");
        }
        String result = resultString.getBody();
        ops.set("WEATHER_DETAIL_"+parameter,result,1800L,TimeUnit.SECONDS);
        return result;
    }
}
