package com.dlithe.baking.controller;


import com.dlithe.baking.dto.PatientDetailsRequest;
import com.dlithe.baking.dto.StudentDetail;
import com.dlithe.baking.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class TestController {

    //path variables
    @Autowired
    private TestService testService;

/*

    @GetMapping("fetch-product-detail/{productName}")
    public String myFirstMethod(@PathVariable String productName)
    {
        String result = testService.fetchProductDetails(productName);
        return result;
    }

    @GetMapping("add-number/{num1}/{num2}")
    public int addTwoNumber(@PathVariable int num1,@PathVariable int num2)
    {
        return testService.addNumber(num1,num2);
    }

    @GetMapping("big-number/{num1}/{num2}")
    public int bigNumber(@PathVariable int num1,@PathVariable int num2)
    {
        return testService.bigNumber(num1,num2);
    }
*/

    @PostMapping("register-patient")
    public String registerNewPatient(@RequestBody PatientDetailsRequest patientDetailsRequest) {
        return testService.registerPatient(patientDetailsRequest);
    }


   /* @GetMapping("get-student-detail/{studentId}")
    public StudentDetail fetchStudentDetail(@PathVariable int studentId)
    {
        return testService.getStudentDetail(studentId);
    }*/


    @GetMapping("get-all-record")
    public List<StudentDetail> fetchStudentDetail() {
        return testService.getStudentDetail();
    }


    @GetMapping("student-detail-review/{studentId}")
    public StudentDetail fetchStudentDetailReview(@PathVariable int studentId) {
        return testService.getStudentDetailReview(studentId);
    }


    @GetMapping("fetch-student-detail/{studentName}")
    public StudentDetail fetchStudentDetailBasedOnName(@PathVariable String studentName) {
        return testService.fetchDetailByUserName(studentName);
    }


    @GetMapping("fetch-student-detailBasedIdName/{studentId}/{studentName}")
    public StudentDetail fetchDetailBasedOnIdName(@PathVariable int studentId,@PathVariable String studentName)
    {
        return testService.fetchDetailBasedOnIdAndName(studentName,studentId);
    }



















    /*{
        switch (productName)
        {
            case "mobile":
                return mobileDetail();
            case "bag":
                return bagDetails();
            default:
                return "no product found";
        }
    }
    public String mobileDetail()
    {
        return "mobile diffrent model is available";
    }
    public String bagDetails()
    {
        return "diffrent bag is found";
    }*/
/*
    @GetMapping("number-detail/{num}")
    public String checkNumber(@PathVariable int num)
    {
        if (num%2==0)
        {
            return "even number";

        }
        else
        {
            return "odd number";

        }
    }
    @GetMapping("add-number/{numOne},{numTwo}")
    public int addTwoNumber(@PathVariable int numOne,@PathVariable int numTwo)
    {

        return numOne+numTwo;

    }
    @GetMapping("find-exception/{num}")
    public String checkException(@PathVariable int num) {
        try {
            int a = num / 0;
        } catch (ArithmeticException e) {
            return "exception is resolve";
        }

        return "next code...";


    }*/

}
