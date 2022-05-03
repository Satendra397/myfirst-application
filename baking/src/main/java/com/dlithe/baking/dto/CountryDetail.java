package com.dlithe.baking.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CountryDetail {

    private int id;
    private String name;
    private String capital;
    private int numOfState;

    private List<StateDetail> stateDetailList;
}
