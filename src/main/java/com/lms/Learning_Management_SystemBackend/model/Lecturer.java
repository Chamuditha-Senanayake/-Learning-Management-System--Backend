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

public class Lecturer {
    @Id @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "lecturer")
    private Set<Course> course;

    private String lecturerId;
    private String password;
    private String name;
    private String email;
    private String state;
}
