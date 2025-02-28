package com.uih.activiti.util.exception;

/**
 * 自定义异常
 */
public class BaseException extends RuntimeException{
    private String code;//状态码

    public BaseException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
