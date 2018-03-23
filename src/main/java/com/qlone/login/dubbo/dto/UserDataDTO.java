package com.qlone.login.dubbo.dto;

import com.qlone.api.basic.dto.BasicDTO;

public class UserDataDTO extends BasicDTO {
    /**
     * 数据库账号id
     */
    private int id;
    /**
     * 账号，唯一不为空
     */
    private String account;
    /**
     * 密码，不为空
     */
    private String password;
    /**
     * 账号邮箱，可为空
     */
    private String mail;
    /**
     * 标志
     */
    private String flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
