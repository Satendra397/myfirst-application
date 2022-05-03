package com.dlithe.baking.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table(name="country")
public class Country {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="capital")
    private String capital;

    @Column(name="numOfState")
    private int numOfState;
}
