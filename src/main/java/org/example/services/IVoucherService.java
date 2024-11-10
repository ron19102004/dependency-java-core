package org.example.services;

import org.example.models.Voucher;

public interface IVoucherService {
    void save(Voucher voucher);
    void sendVoucherToUser(long idUser,long idVoucher);
}
