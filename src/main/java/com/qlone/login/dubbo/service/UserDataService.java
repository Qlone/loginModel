package com.qlone.login.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qlone.api.login.service.UserModelService;
import com.qlone.login.dubbo.dao.UserDataMapper;
import com.qlone.login.dubbo.dto.UserDataDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class UserDataService implements UserModelService {
    Logger logger = LoggerFactory.getLogger(UserModelService.class);
    @Autowired
    UserDataMapper userDataMapper;

    @Override
    public String loginAndGetToken(String account, String password) {
        UserDataDTO userDataDTO = new UserDataDTO();
        userDataDTO.setAccount(account);
        userDataDTO.setPassword(password);
        try {
            int UserId = userDataMapper.insertUser(userDataDTO);
            logger.info("res"+UserId);
            return String.valueOf(userDataDTO.getId());
        } catch (Exception e) {
            logger.info("error",e);
            return "bad";
        }
    }
}
