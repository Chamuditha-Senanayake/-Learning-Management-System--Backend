package com.lms.Learning_Management_SystemBackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student implements Serializable {

    @Id @GeneratedValue
    private int id;
    private String studentId;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    @JsonIgnore
    private User userStudent;

    @OneToMany(mappedBy = "student")
    private Set<Enrolment> enrolment;

}
