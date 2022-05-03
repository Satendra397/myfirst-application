package com.dlithe.baking.serviceimpl;

import com.dlithe.baking.dto.StudentDetailRequest;
import com.dlithe.baking.entity.Student;
import com.dlithe.baking.repository.StudentDAO;
import com.dlithe.baking.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDAO studentDAO;





    @Override
    public String registerStudentDetail(StudentDetailRequest studentDetailRequest) {


        Student student= new Student();

        student.setId(studentDetailRequest.getId());
        student.setName(studentDetailRequest.getName());
        student.setCourse(studentDetailRequest.getCourse());
        student.setCollege(studentDetailRequest.getCollege());

        studentDAO.save(student);

        return "student detail saved successfully!!!";
    }

    @Override
    public String updateStudentDetail(int studentId) {
        Student student=new Student();

        StudentDetailRequest s=new StudentDetailRequest();
        student.setId(s.getId());
        student.setName(s.getName());
        student.setCollege(s.getCollege());
        student.setCourse(s.getCourse());

        studentDAO.save(student);

        return "student detail update successfully";




    }
}
