package com.dlithe.baking.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class BankDetail {


    private int id;
    private String name;
    private String address;
}
