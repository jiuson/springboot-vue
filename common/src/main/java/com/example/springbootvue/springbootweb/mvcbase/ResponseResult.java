package com.example.springbootvue.springbootweb.mvcbase;

import lombok.Setter;

/**
 * @program: springboot-web
 * @descripttion: controller general result
 * @author: jiuson
 * @create: 2019-03-27 14:55:13
 */

@Setter
public class ResponseResult<P> {

    private boolean success;
    private int errorCode;
    private String errorMessage;
    private P payload;

    public P deserialize(){
        if (!this.success){
            throw new GeneralException(this.errorCode, this.errorMessage);
        }else {
            return this.payload;
        }
    }

    public static ResponseResult<Void> success(){
        ResponseResult<Void> instance = new ResponseResult<>();
        instance.setSuccess(true);
        return instance;
    }

    public static <P> ResponseResult<P> success(P payload){
        ResponseResult<P> instance = new ResponseResult<>();
        instance.setSuccess(true);
        instance.setPayload(payload);
        return instance;
    }

    public static ResponseResult<Void> failed(GeneralException be){
        ResponseResult<Void> instance = new ResponseResult<>();
        instance.setErrorCode(be.getErrorCode());
        instance.setErrorMessage(be.getMessage());
        return instance;
    }

    public static <P> ResponseResult<P> failed(GeneralException be, P payload){
        ResponseResult<P> instance = new ResponseResult<>();
        instance.setErrorCode(be.getErrorCode());
        instance.setErrorMessage(be.getMessage());
        instance.setPayload(payload);
        instance.setSuccess(false);
        return instance;
    }
}
