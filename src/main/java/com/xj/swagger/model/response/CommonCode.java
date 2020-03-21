package com.xj.swagger.model.response;

public enum CommonCode implements ResultCode {
    SUCCESS(true,200,"操作成功"),
    FALL(false,500,"操作失败")
    ;
    boolean success;
    int code;
    String msg;
    private CommonCode(boolean success,int code,String msg){
        this.success = success;
        this.code = code;
        this.msg = msg;
    }
    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return msg;
    }
}
