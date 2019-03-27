package com.example.springbootvue.springbootweb.config.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @program: springboot-vue
 * @descripttion: Druid拦截器，用于查看Druid监控
 * @author: jiuson
 * @create: 2019-03-27 17:53:54
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
})//@WebFilter 表明此类是一个拦截器
public class DruidStatFilter extends WebStatFilter {
}
