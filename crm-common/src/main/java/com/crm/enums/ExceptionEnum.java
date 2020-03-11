package com.crm.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {
    SUCCESS(200,"请求成功"),
    PARAM_IS_NUL(400,"参数为空"),
    UN_LOGIN(401,"没有登录");
    private int code;
    private String msg;
}
