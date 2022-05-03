package com.dlithe.baking.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDetailResponse {

    private int id;
    private String firstName;
    private String lastName;
    private String mobileNo;
}
