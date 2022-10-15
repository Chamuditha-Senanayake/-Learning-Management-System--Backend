package com.lms.Learning_Management_SystemBackend.controller;

import com.lms.Learning_Management_SystemBackend.dto.CourseDTO;
import com.lms.Learning_Management_SystemBackend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/course")
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/getCourse/{courseId}")
    public CourseDTO getCourseById(@PathVariable("courseId") String courseId){
        return courseService.getCourseById(courseId);
    }

    @GetMapping("/getAllCourses")
    public List<CourseDTO> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping("/saveCourse")
    public CourseDTO saveCourse(@RequestBody CourseDTO courseDTO){
        return courseService.saveCourse(courseDTO);
    }
}
