package com.dlithe.baking.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentDetailRequest {


    private int id;
    private String name;
    private String course;
    private String college;
}
