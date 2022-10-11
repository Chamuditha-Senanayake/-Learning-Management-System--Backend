package com.lms.Learning_Management_SystemBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private int id;
    private String studentId;
    private String password;
    private String name;
    private String email;
    private String state;
}
