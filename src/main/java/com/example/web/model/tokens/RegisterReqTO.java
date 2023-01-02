package com.example.web.model.tokens;

// 注册请求类，目前与登录请求类相同根据后续添加变量
public class RegisterReqTO {
    private String userName;
    private String password;

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
}
