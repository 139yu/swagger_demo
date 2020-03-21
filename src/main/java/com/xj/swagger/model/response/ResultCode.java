package com.xj.swagger.model.response;

public interface ResultCode {
    boolean success();
    int code();
    String message();
}
