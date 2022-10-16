package com.lms.Learning_Management_SystemBackend.dto;


import com.lms.Learning_Management_SystemBackend.model.Lecturer;
import com.lms.Learning_Management_SystemBackend.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String password;
    private String name;
    private String email;
    private String role;
    private String state;
    private Student student;
    private Lecturer lecturer;
}

