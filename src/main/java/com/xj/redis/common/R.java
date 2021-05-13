package com.xj.redis.common;

import java.io.Serializable;
import java.util.Date;


public class R<T> extends BaseResult implements Serializable {
    public R(){

    }

    public static <T> R<T> ok(){
        return ok(BaseErrorCode.SUCCESS);
    }
    public R<T> setResult(T data){
        this.setData(data);
        return this;
    }
    public static<T> R<T> ok(IMessage message){
        return baseResult(message.getCode(),message.getMessage());
    }
    private static <T> R<T> baseResult(String code,String message) {
        R<T> r = new R();
        r.setCode(code);
        r.setMessage(message);
        r.setTimestamp(new Date().getTime() + "");
        return r;
    }
}
