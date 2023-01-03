package com.example.web.manager;

import com.example.web.model.tokens.*;
import com.example.web.repos.LoginRepo;
import com.example.web.utils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.sql.Date;
import java.util.List;

@Component
@Transactional
public class LoginManager {

    @Autowired
    LoginRepo loginRepo;

    public UserDO checkUserAndPsw(LoginReqTO loginReqTO) {
        String name = loginReqTO.getUserName();
        String password = loginReqTO.getPassword();
        List<UserDO> userDOS = loginRepo.findAllByUserNameAndPassword(name, password);
        return userDOS.get(0);
    }

    public RegisterResTO registerSuccess(RegisterReqTO registerReqTO) {
        UserDO userDO = ConvertUtils.convertTo(registerReqTO, UserDO::new);
        try {
            List<UserDO> userDOList = loginRepo.findAllByUserName(registerReqTO.getUserName());
            if (!ObjectUtils.isEmpty(userDOList)) {
                throw new Exception("用户名已存在");
            } else {
                Date date = new Date(System.currentTimeMillis());
                userDO.setCreate_at(date);
                userDO.setUpdate_at(date);
                loginRepo.save(userDO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RegisterResTO();
    }
}
