package com.example.web.controller;

import com.example.web.manager.LoginManager;
import com.example.web.model.tokens.*;
import com.example.web.model.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    LoginManager loginManager;

    @GetMapping("/login")
    public Result<String> checkUserAndPsw(@RequestBody LoginReqTO loginReqTO){
        loginManager.checkUserAndPsw(loginReqTO);
        return Result.success();
    }

    @GetMapping("/Register")
    public Result<String> register(@RequestBody RegisterReqTO registerReqTO){
        loginManager.register(registerReqTO);
        return Result.success();
    }

    @GetMapping("/modify")
    public Result<String> modify(){
        // TODO: 2023/1/4
        return Result.success();
    }

}
