package org.example.controllers;

import org.example.models.Voucher;

public interface IVoucherController {
    void addVoucher(Voucher voucher);
    void sendVoucher();
};
