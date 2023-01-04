package com.example.web.manager;

import com.example.web.enums.ErrorMsgEnum;
import com.example.web.model.exception.ManagerException;
import com.example.web.model.tokens.*;
import com.example.web.repos.LoginRepo;
import com.example.web.utils.ConvertUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Component
@Transactional
public class LoginManager {

    @Resource
    LoginRepo loginRepo;

    public void checkUserAndPsw(LoginReqTO loginReqTO) {
        String name = loginReqTO.getUserName();
        String password = loginReqTO.getPassword();
        List<UserDO> userDOS = null;
        try {
            userDOS = loginRepo.findAllByUserNameAndPassword(name, password);
        } catch (Exception ignored) {
        }
        if (ObjectUtils.isEmpty(userDOS)) {
            throw new ManagerException(ErrorMsgEnum.PASSWORD_OR_ACCOUNT_ERROR);
        }
    }

    public void register(RegisterReqTO registerReqTO) {
        UserDO userDO = ConvertUtils.convertTo(registerReqTO, UserDO::new);
        List<UserDO> userDOList = null;
        try {
            userDOList = loginRepo.findAllByUserName(registerReqTO.getUserName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!ObjectUtils.isEmpty(userDOList)) {
            throw new ManagerException("用户名已存在");
        } else {
            Date date = new Date(System.currentTimeMillis());
            userDO.setCreate_at(date);
            userDO.setUpdate_at(date);
            loginRepo.save(userDO);
        }
    }
}
