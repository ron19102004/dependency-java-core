package org.example.auth;

import org.example.auth.dto.LoginRequest;
import org.example.auth.dto.LoginResponse;
import org.example.auth.futures.login.LoginProxy;


public class AuthService implements IAuthService {
    private static AuthService instance;
    public static AuthService getInstance(){
        if(instance == null){
            instance = new AuthService();
        }
        return instance;
    }
    private AuthService(){}
    @Override
    public LoginResponse login(LoginRequest request) {
        return LoginProxy
                .get(request.getLoginType())
                .login(request);
    }
}
