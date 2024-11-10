package org.example.views;

import org.example.conf.DIConf;
import org.example.controllers.IUserController;
import org.example.controllers.IVoucherController;
import org.example.models.User;

public class UserView {
    private IUserController iUserController;

    public UserView() {
        iUserController = DIConf
                .getInstance()
                .getIUserController();
        User user = new User();
        iUserController.addUser(user);
    }

    public static void main(String[] args) {
        new UserView();
    }
}
