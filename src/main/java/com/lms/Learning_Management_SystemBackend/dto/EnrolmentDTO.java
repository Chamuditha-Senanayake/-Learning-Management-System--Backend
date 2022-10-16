package com.lms.Learning_Management_SystemBackend.dto;

import com.lms.Learning_Management_SystemBackend.model.Course;
import com.lms.Learning_Management_SystemBackend.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class EnrolmentDTO {
    private int id;
    private Course course;
    private String state;
    private int marks;
    private Student student;
    private String note;
}
