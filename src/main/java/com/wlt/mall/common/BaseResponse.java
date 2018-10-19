package com.wlt.mall.common;

import com.wlt.mall.common.enums.ErrorCode;

import java.io.Serializable;
/**
 * Created by user on 2017/6/11.
 */
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public Long code;

    public String message;

    public T data;


    public BaseResponse(){};

    public BaseResponse(Long code, String message, T data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(T data) {
        super();
        this.code = ErrorCode.SUCCESS.getCode();
        this.message = ErrorCode.SUCCESS.getMessage();
        this.data = data;
    }



    public BaseResponse(ErrorCode e, T data) {
        super();
        this.code = e.getCode();
        this.message = e.getMessage();
        this.data = data;
    }

    public T checkAndGetData(String upStreamMark, Object request) {
        if (this.code.equals(ErrorCode.SUCCESS.getCode())) {
            return this.data;
        } else {
//            throw new UpStreamException(this.code, this.message, upStreamMark, request);
//            throw new Exception("ssss");
            System.out.println(1);
        }

        return this.data;
    }
}





