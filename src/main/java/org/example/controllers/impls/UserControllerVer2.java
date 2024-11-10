package org.example.controllers.impls;

import org.example.models.User;
import org.example.services.IUserService;

public class UserControllerVer2 extends UserController {
    private static UserControllerVer2 instance;
    protected UserControllerVer2(){}
    protected UserControllerVer2(IUserService iUserService) {
        super(iUserService);
    }
    public static UserControllerVer2 getInstance(IUserService iUserService){
        if(instance == null){
            instance = new UserControllerVer2(iUserService);
        }
        return instance;
    }
    @Override
    public void addUser(User user) {
        super.addUser(user);
        System.out.println("send email: sign up successfully!");
    }
}
