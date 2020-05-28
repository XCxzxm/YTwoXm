package com.xc.service.impl;

import com.xc.dao.ReceiptMapper;
import com.xc.domain.Receipt;
import com.xc.service.Receiptservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Receiptserviceimpl implements Receiptservice {
    @Autowired
    private ReceiptMapper receiptMapper;

    @Override
    public boolean savaReceipt(Receipt receipt) {
        return this.receiptMapper.insert(receipt)>0?true:false;
    }
}
