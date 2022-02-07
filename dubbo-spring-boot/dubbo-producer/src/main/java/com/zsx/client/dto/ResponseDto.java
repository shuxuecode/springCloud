package com.zsx.client.dto;

import java.io.Serializable;

/**
 * @author zsx
 * @date 2021年06月17日 13:41
 */
public class ResponseDto implements Serializable {

    private static final long serialVersionUID = 6558952464857724512L;

    private boolean success;

    private Integer code;

    private String msg;

    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
