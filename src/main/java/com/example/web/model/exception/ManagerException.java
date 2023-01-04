package com.example.web.model.exception;

import com.example.web.model.errors.ErrorMsg;
import lombok.Getter;

public class ManagerException extends RuntimeException{

    /**
     * 错误码
     */
    @Getter
    private String errCode;

    /**
     * 错误信息
     */
    @Getter
    private String errMsg;

    /**
     * 错误枚举
     */
    @Getter
    private ErrorMsg errorMsgEnum;

    /**
     * 构造函数
     *
     * @param errCode       错误码
     */
    public ManagerException(String errCode) {
        this.errCode = errCode;
    }


    /**
     * 构造函数
     *
     * @param errCode       错误码
     * @param throwable     异常
     */
    public ManagerException(String errCode, Throwable throwable) {
        super(throwable);
        this.errCode = errCode;
    }

    /**
     * 构造函数
     *
     * @param errCode       错误码
     * @param message       错误信息
     */
    public ManagerException(String errCode, String message) {
        super(message);
        this.errCode = errCode;
        this.errMsg = message;
    }

    /**
     * 构造函数
     *
     * @param errorMsgEnum       错误枚举
     */
    public ManagerException(ErrorMsg errorMsgEnum) {
        super(errorMsgEnum.getMsg());
        this.errorMsgEnum=errorMsgEnum;
        this.errCode = errorMsgEnum.getCode();
        this.errMsg = errorMsgEnum.getMsg();
    }

    /**
     * 构造函数
     *
     * @param errorMsgEnum       错误枚举
     * @param throwable          异常
     */
    public ManagerException(ErrorMsg errorMsgEnum, Throwable throwable) {
        super(throwable);
        this.errorMsgEnum=errorMsgEnum;
        this.errCode = errorMsgEnum.getCode();
        this.errMsg = errorMsgEnum.getMsg();
    }

    /**
     * 构造函数
     *
     * @param errCode           错误码
     * @param message           错误信息
     * @param throwable         异常
     */
    public ManagerException(String errCode, String message, Throwable throwable) {
        super(message, throwable);
        this.errCode = errCode;
        this.errMsg = message;
    }

}

