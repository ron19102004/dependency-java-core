package org.example.views;

import org.example.conf.DIConf;
import org.example.controllers.IVoucherController;
import org.example.models.Voucher;

public class VoucherView {
    private IVoucherController iVoucherController;
    public VoucherView(){
        iVoucherController = DIConf
                .getInstance()
                .getIVoucherController();
        Voucher voucher = new Voucher();
        iVoucherController.addVoucher(voucher);
    }
}
