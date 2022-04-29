package com.dlithe.baking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
@Getter
@Setter
@ToString
@Entity
@Table(name="student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column (name = "id")
    private int id;


    @Column (name="name")
    private String name;


    @Column (name = "age")
    private int age;



}
