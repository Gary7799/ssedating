package com.sse2022.datingdemo.core.exception;

public class BizException extends RuntimeException {
    private final Integer code;

    public BizException(ExceptionType exceptionType) {
        super(exceptionType.getMessage());
        this.code = exceptionType.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
