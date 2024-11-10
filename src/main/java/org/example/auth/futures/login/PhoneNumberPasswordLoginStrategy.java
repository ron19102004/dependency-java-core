package org.example.auth.futures.login;

import org.example.auth.dto.LoginRequest;
import org.example.auth.dto.LoginResponse;

public class PhoneNumberPasswordLoginStrategy implements ILogin{
    @Override
    public LoginResponse login(LoginRequest request) {
        return new LoginResponse(false,"PhoneNumberPasswordLoginStrategy");
    }
}
