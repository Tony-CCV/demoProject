package com.example.web.model.results;

import com.example.web.enums.ErrorMsgEnum;
import com.example.web.model.errors.ErrorMsg;
import org.apache.skywalking.apm.toolkit.trace.TraceContext;
import java.io.Serializable;

// 用来包装所有返回的结果
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Boolean success;
    private String errorCode;
    private String errorMsg;
    private T data;
    private String traceId;
    private Long timeInMillis;

    public Result() {
        this.timeInMillis = System.currentTimeMillis();
    }

    public Result(T data) {
        this.success = true;
        this.data = data;
        this.traceId = TraceContext.traceId();
        this.timeInMillis = System.currentTimeMillis();
    }

    public Result(String errorCode, String errorMsg) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.timeInMillis = System.currentTimeMillis();
        this.traceId = TraceContext.traceId();
    }

    public Result(ErrorMsg errorMsgEnum) {
        this.success = false;
        this.errorCode = errorMsgEnum.getCode();
        this.errorMsg = errorMsgEnum.getMsg();
        this.traceId = TraceContext.traceId();
        this.timeInMillis = System.currentTimeMillis();
    }

    public static Result<String> success() {
        Result<String> result = new Result();
        result.success = true;
        result.data = "success";
        result.traceId = TraceContext.traceId();
        result.timeInMillis = System.currentTimeMillis();
        return result;
    }

    public static Result<String> fail(String errorMsg) {
        Result<String> result = new Result();
        result.success = false;
        result.errorCode = ErrorMsgEnum.SYSTEM_ERROR.getCode();
        result.errorMsg = errorMsg;
        result.traceId = TraceContext.traceId();
        result.timeInMillis = System.currentTimeMillis();
        return result;
    }

    public static Result<String> fail(String errorCode, String errorMsg) {
        Result<String> result = new Result();
        result.success = false;
        result.errorCode = errorCode;
        result.errorMsg = errorMsg;
        result.traceId = TraceContext.traceId();
        result.timeInMillis = System.currentTimeMillis();
        return result;
    }

    public static Result<String> fail() {
        Result<String> result = new Result();
        result.success = false;
        result.errorCode = ErrorMsgEnum.SYSTEM_ERROR.getCode();
        result.timeInMillis = System.currentTimeMillis();
        result.traceId = TraceContext.traceId();
        return result;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTimeInMillis() {
        return this.timeInMillis;
    }

    public void setTimeInMillis(Long timeInMillis) {
        this.timeInMillis = timeInMillis;
    }
}

