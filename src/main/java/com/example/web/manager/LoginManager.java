package com.example.web.manager;

import com.example.web.model.LoginResTO;
import com.example.web.model.RegisterResTO;
import org.springframework.stereotype.Component;

@Component
public class LoginManager {

    public LoginResTO checkUserAndPsw(){
        // 待实现登录验证方法
        return new LoginResTO();
    }

    public RegisterResTO registerSuccess(){
        // 待实现注册方法
        return new RegisterResTO();
    }
}
