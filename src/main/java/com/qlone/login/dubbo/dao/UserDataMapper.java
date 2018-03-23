package com.qlone.login.dubbo.dao;

import com.qlone.login.dubbo.dto.UserDataDTO;

public interface UserDataMapper {
    /**
     * 插入新的用户
     * @param userDataDTO 必须有账号密码
     * @return
     */
    int insertUser(UserDataDTO userDataDTO) throws Exception;
}
