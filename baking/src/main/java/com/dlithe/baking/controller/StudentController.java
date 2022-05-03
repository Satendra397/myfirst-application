package com.dlithe.baking.controller;


import com.dlithe.baking.dto.StudentDetailRequest;
import com.dlithe.baking.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;




    @PostMapping("register-student-detail")
    public String registerStudentDetail(@RequestBody StudentDetailRequest studentDetailRequest)
    {
        return studentService.registerStudentDetail(studentDetailRequest);
    }
    @PutMapping("update-student-detail/{studentId}")
    public String updateStudentDetail(@PathVariable int studentId)
    {
        return studentService.updateStudentDetail(studentId);
    }
}
