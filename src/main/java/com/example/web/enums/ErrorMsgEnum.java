package com.example.web.enums;

import com.example.web.model.errors.ErrorMsg;

// 用来返回所有错误状态的enum类
public enum ErrorMsgEnum implements ErrorMsg {

    PASSWORD_OR_ACCOUNT_ERROR("PASSWORD_OR_ACCOUNT_ERROR","用户名或密码错误"),
    PASSWORD_ACCOUNT_NOT_SAME("PASSWORD_ACCOUNT_NOT_SAME", "密码不能与账号一致"),
    ACCOUNT_IS_LOCKED("ACCOUNT_IS_LOCKED", "账号锁定，联系上级权限账号解锁"),
    PASSWORD_ERROR_IS_LOCK("PASSWORD_ERROR_IS_LOCK", "账号锁定，联系上级权限账号解锁"),
    PASSWORD_TIMES_IS_LOCK("PASSWORD_TIMES_IS_LOCK", "用户名或密码错误,还有%s次机会,账号将被锁定"),
    SYSTEM_ERROR("SYSTEM_ERROR","系统出现错误");

    ErrorMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}