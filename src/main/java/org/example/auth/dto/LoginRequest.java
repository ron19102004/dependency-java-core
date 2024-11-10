package org.example.auth.dto;

import org.example.auth.futures.login.LoginType;

public class LoginRequest {
    private String username;
    private String password;
    private LoginType loginType;

    public LoginRequest(String username, String password,LoginType loginType) {
        this.username = username;
        this.password = password;
        this.loginType = loginType;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
