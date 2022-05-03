package com.dlithe.baking.repository;

import com.dlithe.baking.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student,Integer> {



    
}
