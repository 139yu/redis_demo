package com.xj.redis.common;

/**
 *
 */
public enum BaseErrorCode implements IMessage {
    SUCCESS("0000","succeed"),
    PARAM_EMPTY("1001", "必选参数为空"),
    PARAM_ERROR("1002", "参数格式错误"),
    UNKNOWN_ERROR("9999", "系统繁忙，请稍后再试....");
    private String code;
    private String message;
    private BaseErrorCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
