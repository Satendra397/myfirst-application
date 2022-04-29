package com.dlithe.baking.service;

import com.dlithe.baking.dto.PatientDetailsRequest;
import com.dlithe.baking.dto.StudentDetail;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public interface TestService {




    String fetchProductDetails(String productName);
    int addNumber(int num1,int num2);
    int bigNumber(int num1,int num2);

    String registerPatient(PatientDetailsRequest patientDetailsRequest); //post mapping

    StudentDetail getStudentDetail(int studentId);  //get mapping

    List<StudentDetail> getStudentDetail();        //get mapping

    Set<StudentDetail>  getStudentRecord();
}
