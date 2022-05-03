package com.dlithe.baking.serviceimpl;


import com.dlithe.baking.dto.BankDetail;
import com.dlithe.baking.entity.Bank;
import com.dlithe.baking.repository.BankDAO;
import com.dlithe.baking.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankImpl implements BankService {



    @Autowired
    private BankDAO bankDAO;


    @Override
    public BankDetail fetchBankDetailBasedOnName(String bankName) {
        BankDetail bankDetail=new BankDetail();

        Bank bank=bankDAO.findByName(bankName);

        bankDetail.setId(bank.getId());
        bankDetail.setName(bank.getName());
        bankDetail.setAddress(bank.getName());

        return bankDetail;
    }
}
