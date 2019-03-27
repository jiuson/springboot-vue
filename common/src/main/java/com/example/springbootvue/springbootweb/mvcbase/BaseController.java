package com.example.springbootvue.springbootweb.mvcbase;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springboot-web
 * @descripttion: base controller
 * @author: jiuson
 * @create: 2019-03-27 14:50:42
 */
@Slf4j
public abstract class BaseController {

    @ExceptionHandler({GeneralException.class})
    public ResponseResult<Void> businessExceptionHandler(HttpServletRequest request, GeneralException be){
        log.info(String.valueOf(be.getErrorCode()), be);
        ResponseResult<Void> response = ResponseResult.failed(be);
        return response;
    }

    public String getRemoteIp(HttpServletRequest request){
        return request.getHeader("x-forwarded-for") == null ? request.getRemoteAddr() : request.getHeader("x-forwarded-for");
    }
}
