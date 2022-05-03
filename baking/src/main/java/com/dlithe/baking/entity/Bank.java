package com.dlithe.baking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name="bank")
public class Bank {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;
}
