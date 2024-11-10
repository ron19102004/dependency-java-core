package org.example.controllers.impls;

import org.example.controllers.IUserController;
import org.example.models.User;
import org.example.services.IUserService;
import org.example.services.impls.UserService;

import java.util.ArrayList;

public class UserController implements IUserController {
    private static UserController instance;
    protected ArrayList<User> users;
    protected IUserService iUserService;
    protected UserController(){}
    protected UserController(IUserService iUserService){
        this.users = new ArrayList<>();
        this.iUserService = iUserService;
    }
    public static UserController getInstance(IUserService iUserService){
        if(instance == null){
            instance = new UserController(iUserService);
        }
        return instance;
    }
    @Override
    public void addUser(User user) {
        iUserService.save(user);
        users.add(user);
    }

    @Override
    public void displayList() {
        users.stream().forEach(System.out::println);
    }
}
