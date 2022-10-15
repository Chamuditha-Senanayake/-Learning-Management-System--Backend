package com.lms.Learning_Management_SystemBackend.repo;

import com.lms.Learning_Management_SystemBackend.model.Course;
import com.lms.Learning_Management_SystemBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {

    Course findCourseByCourseId(String courseId);

}
