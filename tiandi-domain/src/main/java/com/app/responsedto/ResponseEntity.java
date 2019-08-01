package com.app.responsedto;


import com.app.enums.ExceptionCode;

import java.io.Serializable;

public class ResponseEntity implements Serializable{

    private Integer code = ExceptionCode.SYSTEM_EXCEPTION.getCode();
    private String msg;
    private Object result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
