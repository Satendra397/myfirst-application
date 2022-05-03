package com.dlithe.baking.controller;


import com.dlithe.baking.dto.BankDetail;
import com.dlithe.baking.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {



    @Autowired
    private BankService bankService;


    @GetMapping("fetch-bank-detailBasedOnName/{bankName}")
    public BankDetail fetchBankDetail(@PathVariable String bankName)
    {
        return bankService.fetchBankDetailBasedOnName(bankName);
    }


}
