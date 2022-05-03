package com.dlithe.baking.service;

import com.dlithe.baking.dto.StudentDetailRequest;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {
    public String registerStudentDetail(StudentDetailRequest studentDetailRequest);//

    String updateStudentDetail(int studentId);//update student detail
}
