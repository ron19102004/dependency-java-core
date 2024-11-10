package org.example;

import org.example.auth.AuthService;
import org.example.auth.dto.LoginRequest;
import org.example.auth.futures.login.LoginType;
import org.example.conf.DIConf;
import org.example.controllers.IUserController;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
//        IUserController iUserController1 = DIConf.getInstance().getIUserController();
//        IUserController iUserController2 = DIConf.getInstance().getIUserController();
//
//        User user = new User();
//        iUserController1.addUser(user);
//
//        User user1 = new User();
//        iUserController2.addUser(user1);
//
//        iUserController1.displayList();
        AuthService authService = AuthService.getInstance();
        LoginRequest loginRequest = new LoginRequest("abc","1234", LoginType.PHONE_NUMBER);
        System.out.println(authService.login(loginRequest));;
    }
}