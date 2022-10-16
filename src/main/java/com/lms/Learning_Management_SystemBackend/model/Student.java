package com.lms.Learning_Management_SystemBackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {

    @Id @GeneratedValue
    private int id;
    private String studentId;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User userStudent;

    @OneToMany(mappedBy = "student")
    private Set<Enrolment> enrolment;

}
