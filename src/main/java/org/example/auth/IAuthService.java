package org.example.auth;

import org.example.auth.dto.LoginRequest;
import org.example.auth.dto.LoginResponse;

public interface IAuthService {
    LoginResponse login(LoginRequest request);
}
