package com.dlithe.baking.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class PatientDetailsRequest {

    private String name;
    private int age;




}
