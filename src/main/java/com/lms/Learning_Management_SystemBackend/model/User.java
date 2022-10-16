package com.lms.Learning_Management_SystemBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable {

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

    @OneToMany(mappedBy = "user")
    private Set<Enrolment> enrolment;

    private String state;

}
