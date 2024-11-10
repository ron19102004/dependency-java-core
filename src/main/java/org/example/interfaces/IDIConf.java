package org.example.interfaces;

import org.example.controllers.IUserController;
import org.example.controllers.IVoucherController;
import org.example.services.IUserService;
import org.example.services.IVoucherService;


interface IUserDIConf {
    IUserController getIUserController();
    IUserService getIUserService();
}

interface IVoucherDIConf {
    IVoucherController getIVoucherController();
    IVoucherService getIVoucherService();
}

public interface IDIConf extends
        IUserDIConf,
        IVoucherDIConf {
}
