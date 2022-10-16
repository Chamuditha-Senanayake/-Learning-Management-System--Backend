package com.lms.Learning_Management_SystemBackend.dto;

import com.lms.Learning_Management_SystemBackend.model.Course;
import com.lms.Learning_Management_SystemBackend.model.Student;
import com.lms.Learning_Management_SystemBackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class EnrolmentDTO {
    private int id;
    private String state;
    private int marks;
    private String note;
    private String coursesId;
    private int userId;
}
