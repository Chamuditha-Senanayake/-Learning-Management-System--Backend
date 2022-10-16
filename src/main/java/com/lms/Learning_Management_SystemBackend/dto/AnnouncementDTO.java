package com.lms.Learning_Management_SystemBackend.dto;

import com.lms.Learning_Management_SystemBackend.model.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnnouncementDTO {
    private int id;
    private String updated_date;
    private String title;
    private String description;
    private String state;
    private String courseId;
  // private Course courses;
}
