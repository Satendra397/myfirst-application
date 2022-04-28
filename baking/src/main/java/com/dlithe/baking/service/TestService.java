package com.dlithe.baking.service;

import com.dlithe.baking.dto.PatientDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface TestService {



    String fetchProductDetails(String productName);
    int addNumber(int num1,int num2);
    int bigNumber(int num1,int num2);

    String registerPatient(PatientDetailsRequest patientDetailsRequest);

}
