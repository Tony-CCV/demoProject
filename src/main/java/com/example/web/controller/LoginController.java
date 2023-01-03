package com.example.web.controller;

import com.example.web.manager.LoginManager;
import com.example.web.model.tokens.*;
import com.example.web.model.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginManager loginManager;


    @GetMapping("/login")
    public Result<UserDO> checkUserAndPsw(@RequestBody LoginReqTO loginReqTO) {
        return new Result(loginManager.checkUserAndPsw(loginReqTO));
    }

    @GetMapping("/Register")
    public Result<RegisterResTO> registerSuccess(@RequestBody RegisterReqTO registerReqTO){
        return new Result(loginManager.registerSuccess(registerReqTO));
    }

}
