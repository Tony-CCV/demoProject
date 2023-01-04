package com.example.web.model.tokens;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

// 注册请求类，目前与登录请求类相同根据后续添加变量
public class RegisterReqTO {

    // 电话号码
    @ApiModelProperty(value = "电话号码", required = true)
    @NotBlank(message = "电话号码")
    @Pattern(regexp = "^[0-9]", message = "数字")
    @Size(min = 11,max = 11)
    private Integer phoneNumber;

    // 用户姓名
    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = "^[A-Za-z0-9_]+$", message = "用户名，支持字母、数字、下划线")
    private String userName;

    // 用户密码
    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "密码不能为空")
    private String password;

    // 邮箱
    @ApiModelProperty(value = "email", required = true)
    @NotBlank(message = "邮箱")
    @Pattern(regexp = "^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$")
    private String emailAddress;

    // 真实姓名
    @ApiModelProperty(value = "姓名", required = true)
    @NotBlank(message = "姓名不能为空")
    @Pattern(regexp = "^[\u4e00-\u9fa5]")
    private String realName;

    // 身份证号码
    @ApiModelProperty(value = "身份证号码", required = true)
    @NotBlank(message = "身份证不能为空")
    @Pattern(regexp = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$")
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
