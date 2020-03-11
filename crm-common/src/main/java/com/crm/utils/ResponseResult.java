package com.crm.utils;

import com.crm.enums.ExceptionEnum;
import lombok.Data;

import java.util.Date;

@Data
public class ResponseResult {
    private int code;
    private String msg;
    private Long time;

    public ResponseResult(ExceptionEnum exceptionEnum){
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMsg();
        this.time = new Date().getTime();
    }
}
