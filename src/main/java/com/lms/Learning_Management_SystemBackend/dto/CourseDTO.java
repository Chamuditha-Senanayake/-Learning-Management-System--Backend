package com.lms.Learning_Management_SystemBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDTO {
    private int id;
    private String courseId;
    private String title;
    private String description;
    private String lecturerId;
    private String updated_date;
    private String state;
}
