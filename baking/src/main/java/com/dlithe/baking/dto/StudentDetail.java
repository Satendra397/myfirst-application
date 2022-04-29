package com.dlithe.baking.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentDetail {

    private int id;
    private String name;
    private int age;

    //      private StudentPerformanceResponse response;

    private List<StudentPerformanceResponse>  studentResponse;


}
