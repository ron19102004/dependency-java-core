package org.example.services.impls;


import org.example.models.User;

public class UserServiceVer2 extends UserService {
    private static UserServiceVer2 instance;
    public static UserServiceVer2 getInstance() {
        if (instance == null) {
            instance = new UserServiceVer2();
        }     return instance;
    }
    protected UserServiceVer2() {
    }
    @Override
    public void save(User user) {
        super.save(user);
    }
}

