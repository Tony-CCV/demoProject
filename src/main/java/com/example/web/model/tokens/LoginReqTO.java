package com.example.web.model.tokens;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;

// 登录请求类
public class LoginReqTO {

    // 电话号码

    @ApiModelProperty(value = "电话号码", required = true)
    @NotBlank(message = "电话号码")
    private Integer phoneNumber;

    // 用户姓名
    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "用户名不能为空")
    private String userName;

    // 用户密码
    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "密码不能为空")
    private String password;

    // 再次确认密码
    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "密码不能为空")
    private String confirmPsd;

    // 邮箱
    @ApiModelProperty(value = "email", required = true)
    @NotBlank(message = "邮箱")
    private String emailAddress;

    // 真实姓名
    @ApiModelProperty(value = "姓名", required = true)
    @NotBlank(message = "姓名不能为空")
    private String realName;

    // 身份证号码
    @ApiModelProperty(value = "身份证号码", required = true)
    @NotBlank(message = "身份证不能为空")
    private String idNumber;


    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPsd() {
        return confirmPsd;
    }

    public void setConfirmPsd(String confirmPsd) {
        this.confirmPsd = confirmPsd;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}

