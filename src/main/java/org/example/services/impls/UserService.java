package org.example.services.impls;

import org.example.models.User;
import org.example.services.IUserService;

public class UserService implements IUserService {
    //single class
    private static UserService instance;
    public static UserService getInstance(){
        if(instance == null){
            instance = new UserService();
        }
        return instance;
    }
    protected UserService(){}
    @Override
    public void save(User user) {
        System.out.println("save successfully!");
    }

    @Override
    public User findById(long id) {
        System.out.println("Founded User");
        return new User();
    }
}
