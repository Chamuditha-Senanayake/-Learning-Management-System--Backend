package com.lms.Learning_Management_SystemBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    @Id @GeneratedValue
    private int id;
    private String courseId;
    private String title;
    private String description;
    private String lecturerId;
    private String updated_date;
    private String state;
}
