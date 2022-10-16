package com.lms.Learning_Management_SystemBackend.model;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Enrolment {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name="course_id", referencedColumnName = "courseId")
    private Course courses;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private String state;
    private int marks;
    private String note;
}
