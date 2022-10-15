package com.lms.Learning_Management_SystemBackend.dto;

import com.lms.Learning_Management_SystemBackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LecturerDTO {
    private int id;
    private String lecturerId;
    private User userLecturer;
}
