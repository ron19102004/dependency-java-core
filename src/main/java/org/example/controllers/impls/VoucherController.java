package org.example.controllers.impls;

import org.example.controllers.IVoucherController;
import org.example.models.Voucher;
import org.example.services.IUserService;
import org.example.services.IVoucherService;

import java.util.ArrayList;

public class VoucherController implements IVoucherController {
    private static VoucherController instance;
    protected ArrayList<Voucher> vouchers;
    protected IVoucherService iVoucherService;
    protected VoucherController(IVoucherService iVoucherService){
        this.iVoucherService = iVoucherService;
        this.vouchers = new ArrayList<>();
    }
    protected VoucherController(){}
    public static VoucherController getInstance(IVoucherService iVoucherService){
        if(instance == null){
            instance = new VoucherController(iVoucherService);
        }
        return instance;
    }
    @Override
    public void addVoucher(Voucher voucher) {
        System.out.println("Add voucher successfully");
    }

    @Override
    public void sendVoucher() {
        System.out.println("Send voucher successfully");
    }
}
