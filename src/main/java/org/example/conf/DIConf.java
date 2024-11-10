package org.example.conf;

import org.example.controllers.IUserController;
import org.example.controllers.IVoucherController;
import org.example.controllers.impls.UserController;
import org.example.controllers.impls.UserControllerVer2;
import org.example.controllers.impls.VoucherController;
import org.example.interfaces.IDIConf;
import org.example.services.IUserService;
import org.example.services.IVoucherService;
import org.example.services.impls.UserServiceVer2;
import org.example.services.impls.VoucherService;

public class DIConf implements IDIConf {
    //single class
    private static DIConf instance;

    public static DIConf getInstance() {
        if (instance == null) {
            instance = new DIConf();
        }
        return instance;
    }

    private DIConf() {
    }

    @Override
    public IUserController getIUserController() {
        return UserControllerVer2.getInstance(getIUserService());
    }

    @Override
    public IVoucherController getIVoucherController() {
        return VoucherController.getInstance(getIVoucherService());
    }

    @Override
    public IVoucherService getIVoucherService() {
        return VoucherService.getInstance();
    }

    @Override
    public IUserService getIUserService() {
        return UserServiceVer2.getInstance();
    }
}
