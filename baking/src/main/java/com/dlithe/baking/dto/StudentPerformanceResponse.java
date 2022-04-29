package com.dlithe.baking.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StudentPerformanceResponse {



    private int mark;
    private String grade;
    private String subject;
}
