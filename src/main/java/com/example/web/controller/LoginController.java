package com.example.web.controller;

import com.example.web.manager.LoginManager;
import com.example.web.model.LoginResTO;
import com.example.web.model.RegisterResTO;
import com.example.web.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    LoginManager loginManager;

    @GetMapping("/login")
    public Result<LoginResTO> checkUserAndPsw() {
        return new Result(loginManager.checkUserAndPsw());
    }

    @GetMapping("/Register")
    public Result<RegisterResTO> registerSuccess(){
        return new Result(loginManager.registerSuccess());
    }

}
