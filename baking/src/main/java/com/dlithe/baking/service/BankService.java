package com.dlithe.baking.service;


import com.dlithe.baking.dto.BankDetail;
import org.springframework.stereotype.Component;

@Component
public interface BankService {
    BankDetail fetchBankDetailBasedOnName(String bankName);//
}
