package com.dlithe.baking.serviceimpl;

import com.dlithe.baking.dto.PatientDetailsRequest;
import com.dlithe.baking.dto.StudentDetail;
import com.dlithe.baking.dto.StudentPerformanceResponse;
import com.dlithe.baking.entity.Student;
import com.dlithe.baking.repository.StudentDAO;
import com.dlithe.baking.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private StudentDAO studentDAO;







/*
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
    }*/

    @Override
    public String registerPatient(PatientDetailsRequest patientDetailsRequest) {
        Student student = new Student();

        student.setName(patientDetailsRequest.getName());
        student.setAge(patientDetailsRequest.getAge());
        

        studentDAO.save(student);
        return "Student detailed saved successfully!!!";
    }


   /* @Override
    public StudentDetail getStudentDetail(int studentId) {

        List<StudentPerformanceResponse> performanceResponses = new ArrayList<>();

        Optional<Student> student = studentDAO.findById(studentId);
        Student studentDetailFromDb = student.get();

       StudentDetail studentDetail = new StudentDetail();
        //StudentPerformanceResponse  studentPerformanceResponse= new StudentPerformanceResponse();

        studentDetail.setName(studentDetailFromDb.getName());
        studentDetail.setId(studentDetailFromDb.getId());
        studentDetail.setAge(studentDetailFromDb.getAge());


        // single review

       // studentPerformanceResponse.setGrade("a");
        //studentPerformanceResponse.setMark(77);
        //studentPerformanceResponse.setSubject("math");

        //studentDetail.setResponse(studentPerformanceResponse);

        *//**
         * using list multiple review
         *//*
        StudentPerformanceResponse s1 = new StudentPerformanceResponse(); //object
        s1.setSubject("math");
        s1.setGrade("B");
        s1.setMark(88);
        performanceResponses.add(s1);

        StudentPerformanceResponse s2 = new StudentPerformanceResponse(); // object

        s2.setMark(89);
        s2.setSubject("cs");
        s2.setGrade("A");

        performanceResponses.add(s2);

        studentDetail.setStudentResponse(performanceResponses);
        return studentDetail;
    }
*/


    @Override
    public List<StudentDetail> getStudentDetail() {

        List<StudentDetail> studentDetailList=new ArrayList<>();
        List<Student> studentList=studentDAO.findAll();

        for(Student student:studentList)
        {
            StudentDetail studentDetail=new StudentDetail();
            studentDetail.setName(student.getName());
            studentDetail.setAge(student.getAge());
            studentDetail.setId(student.getId());
            studentDetailList.add(studentDetail);
        }
        return studentDetailList;
    }

    @Override
    public StudentDetail getStudentDetailReview(int studentId) {
        Optional<Student> student=studentDAO.findById(studentId);
        Student studentDetail=student.get();

        StudentDetail studentDetail1=new StudentDetail();

        studentDetail1.setName(studentDetail.getName());
        studentDetail1.setId(studentDetail.getId());
        studentDetail1.setAge(studentDetail.getAge());

        List<StudentPerformanceResponse> responses= new ArrayList<>();

        StudentPerformanceResponse s1= new StudentPerformanceResponse();
        s1.setGrade("A");
        s1.setMark(33);
        s1.setSubject("physics");
        responses.add(s1);

        StudentPerformanceResponse s2= new StudentPerformanceResponse();
        s2.setGrade("B");
        s2.setMark(39);
        s2.setSubject("math");
        responses.add(s2);


        StudentPerformanceResponse s3= new StudentPerformanceResponse();
        s3.setGrade("c");
        s3.setMark(36);
        s3.setSubject("english");
        responses.add(s3);

        studentDetail1.setStudentResponse(responses);



        return  studentDetail1;


    }

    @Override
    public StudentDetail fetchDetailByUserName(String studentName) {


        StudentDetail studentDetail = new StudentDetail();
        Student student = studentDAO.findByName(studentName);

        studentDetail.setName(student.getName());
        studentDetail.setAge(student.getAge());
        studentDetail.setId(student.getId());

        return studentDetail;
    }

    @Override
    public StudentDetail fetchDetailBasedOnIdAndName(String studentName, int studentId) {

        Student student=studentDAO.findByNameAndId(studentId,studentName);
        StudentDetail studentDetail=new StudentDetail();

        studentDetail.setId(student.getId());
        studentDetail.setName(student.getName());
        studentDetail.setAge(student.getAge());

        return studentDetail;


    }
}







