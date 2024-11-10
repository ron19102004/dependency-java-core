package org.example.auth.futures.login;

import org.example.auth.dto.LoginRequest;
import org.example.auth.dto.LoginResponse;

public interface ILogin {
    LoginResponse login(LoginRequest request);
}
