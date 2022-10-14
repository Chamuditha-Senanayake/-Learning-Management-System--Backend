package com.lms.Learning_Management_SystemBackend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Lecturer implements Serializable {
    @Id @GeneratedValue
    private int id;
    private String lecturerId;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User userLecturer;

    @OneToMany(mappedBy = "lecturer")
    private Set<Course> course;

}
