package com.lms.Learning_Management_SystemBackend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Course implements Serializable {
    @Id @GeneratedValue
    private int id;
    private String courseId;
    private String title;
    private String description;

    @JoinColumn(name= "lecturer_id", referencedColumnName = "lecturerId")
    @ManyToOne
    private Lecturer lecturer;

    @OneToMany(mappedBy= "courses")
    private Set<Announcement> announcement;

    @OneToMany(mappedBy = "course")
    private Set<Enrolment> enrolment;


    private String updated_date;
    private String state;



}
