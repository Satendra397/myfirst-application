package com.dlithe.baking.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Table(name="user")
@Entity
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    private int id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="mobileNo")
    private String mobileNo;
}
