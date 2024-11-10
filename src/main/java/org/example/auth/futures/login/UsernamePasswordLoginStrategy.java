package org.example.auth.futures.login;

import org.example.auth.dto.LoginRequest;
import org.example.auth.dto.LoginResponse;

public class UsernamePasswordLoginStrategy implements ILogin{
    @Override
    public LoginResponse login(LoginRequest request) {
        return new LoginResponse(true,"UsernamePasswordLoginStrategy");
    }
}
