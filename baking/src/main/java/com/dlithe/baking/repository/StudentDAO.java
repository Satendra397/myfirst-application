package com.dlithe.baking.repository;


import com.dlithe.baking.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student,Integer> {


    @Query(value = "SELECT * FROM student WHERE name=?1",nativeQuery = true)
    Student findByName(String studentName);



    @Query(value = "select * from student where id=?1 and name=?2",nativeQuery = true)
    Student findByNameAndId(int studentId, String studentName);
}
