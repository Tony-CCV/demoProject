package com.example.web.controller;

import com.example.web.manager.LoginManager;
import com.example.web.model.tokens.LoginReqTO;
import com.example.web.model.tokens.LoginResTO;
import com.example.web.model.tokens.RegisterReqTO;
import com.example.web.model.tokens.RegisterResTO;
import com.example.web.model.results.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    LoginManager loginManager;

    @GetMapping("/login")
    public Result<LoginResTO> checkUserAndPsw(LoginReqTO loginReqTO) {
        return new Result(loginManager.checkUserAndPsw());
    }

    @GetMapping("/Register")
    public Result<RegisterResTO> registerSuccess(RegisterReqTO registerReqTO){
        return new Result(loginManager.registerSuccess());
    }

}
