package com.lms.Learning_Management_SystemBackend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Announcement implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String updated_date;
    private String title;
    private String description;
    private String state;

    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    @ManyToOne
    private Course course;

}
