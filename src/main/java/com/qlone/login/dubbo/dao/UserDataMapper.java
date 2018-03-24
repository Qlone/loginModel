package com.qlone.login.dubbo.dao;

import com.qlone.login.dubbo.dto.UserDataDTO;

public interface UserDataMapper {
    /**
     * 插入新的用户
     * @param userDataDTO 必须有账号密码
     * @return
     */
    int insertUser(UserDataDTO userDataDTO) throws Exception;

    /**
     * 根据account 查询是否有用户accont存在
     * @return 返回含有id 的 dto
     * @throws Exception
     */
    UserDataDTO queryUserAccount(UserDataDTO userDataDTO) throws Exception;
}
