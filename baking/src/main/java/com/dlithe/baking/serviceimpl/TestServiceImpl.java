package com.dlithe.baking.serviceimpl;

import com.dlithe.baking.dto.PatientDetailsRequest;
import com.dlithe.baking.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String fetchProductDetails(String productName) {
        switch (productName)
        {
            case "mobile":
                return " mobile is found";
            case "bag":
                return " bag  is found";
            default:
                return "not found product";
        }
    }

    @Override
    public int addNumber(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int bigNumber(int num1, int num2) {
        if(num1>num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }

    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest) {
        return null;
    }
}
