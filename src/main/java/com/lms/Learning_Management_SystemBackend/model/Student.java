package com.lms.Learning_Management_SystemBackend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

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

    @OneToMany(mappedBy = "student")
    private Set<Enrolment> enrolment;

}
