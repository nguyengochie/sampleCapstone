package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.entity.RoleEntity;

import javax.persistence.Column;
import java.util.List;

public class UserDTO extends AbstractDTO<UserDTO>{

    private String userName;
    private String password;
    private String fullName;
    private Integer status;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
