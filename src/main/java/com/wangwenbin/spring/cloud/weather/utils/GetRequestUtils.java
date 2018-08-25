package com.wangwenbin.spring.cloud.weather.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取请求ip
 * */
public class GetRequestUtils {
        public static String calcIp(HttpServletRequest request){
            String ip = request.getHeader("x-forwarded-for");
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
            return ip;
    }
}
