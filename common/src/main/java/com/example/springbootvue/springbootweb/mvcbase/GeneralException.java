package com.example.springbootvue.springbootweb.mvcbase;

import lombok.Getter;

/**
 * @program: springboot-web
 * @descripttion: general exception
 * @author: jiuson
 * @create: 2019-03-27 14:52:50
 */
@Getter
public class GeneralException extends RuntimeException{

    private int errorCode;

    public GeneralException(String msg){
        super(msg);
        this.errorCode = -1;
    }

    public GeneralException(int errorCode, String msg){
        super(msg);
        this.errorCode = errorCode;
    }
}
