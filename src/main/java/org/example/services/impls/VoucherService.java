package org.example.services.impls;

import org.example.conf.DIConf;
import org.example.models.User;
import org.example.models.Voucher;
import org.example.services.IUserService;
import org.example.services.IVoucherService;

public class VoucherService implements IVoucherService {
    private static VoucherService instance;
    public static VoucherService getInstance(){
        if(instance == null){
            instance = new VoucherService();
        }
        return instance;
    }
    protected VoucherService(){

    }
    @Override
    public void save(Voucher voucher) {
        System.out.println("Save voucher");
    }

    @Override
    public void sendVoucherToUser(long idUser, long idVoucher) {
        System.out.println("Send " + idVoucher + " to " + idUser);
    }
}
