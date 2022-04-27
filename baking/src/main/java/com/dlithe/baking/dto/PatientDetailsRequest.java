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



    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String disease;

}
