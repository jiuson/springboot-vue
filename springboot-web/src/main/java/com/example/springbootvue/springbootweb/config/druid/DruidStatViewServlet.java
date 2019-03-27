package com.example.springbootvue.springbootweb.config.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @program: springboot-vue
 * @descripttion: Druid的监控Servlet
 * @author: jiuson
 * @create: 2019-03-27 17:54:37
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*", initParams = {
        @WebInitParam(name = "allow", value = "127.0.0.1"),//IP白名单（没有配置或为空，则允许所有访问）
        @WebInitParam(name = "deny", value = "192.168.1.111"),//IP黑名单（存在共同时，deny优先于allow）
        @WebInitParam(name = "loginUsername", value = "admin"),//用户名
        @WebInitParam(name = "loginPassword", value = "666666"),//密码
        @WebInitParam(name = "resetEnable", value = "false")//禁用HTML页面上的“Reset All”功能
})//@WebServlet表明此类是一个Servlet，和Application中的@ServletComponentScan相对应使用
public class DruidStatViewServlet extends StatViewServlet {
}
