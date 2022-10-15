package com.lms.Learning_Management_SystemBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String password;
    private String name;
    private String email;
    private String role;

    @OneToOne(mappedBy = "userStudent")
    private Student student;

    @OneToOne(mappedBy = "userLecturer")
    private Lecturer lecturer;

    private String state;

}
