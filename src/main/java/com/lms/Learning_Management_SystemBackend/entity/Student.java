package com.lms.Learning_Management_SystemBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id @GeneratedValue
    private int id;
    private String studentId;
    private String password;
    private String name;
    private String email;
    private String state;

}