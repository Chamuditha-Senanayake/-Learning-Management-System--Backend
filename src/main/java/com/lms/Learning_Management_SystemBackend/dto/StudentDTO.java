package com.lms.Learning_Management_SystemBackend.dto;

import com.lms.Learning_Management_SystemBackend.model.Enrolment;
import com.lms.Learning_Management_SystemBackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private int id;
    private String studentId;
    private User userStudent;


}
