package com.lms.Learning_Management_SystemBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LecturerDTO {
    private int id;
    private String lecturerId;
    private String password;
    private String name;
    private String email;
    private String state;
}
