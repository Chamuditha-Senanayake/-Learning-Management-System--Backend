package com.lms.Learning_Management_SystemBackend.controller;

import com.lms.Learning_Management_SystemBackend.dto.CourseDTO;
import com.lms.Learning_Management_SystemBackend.dto.StudentDTO;
import com.lms.Learning_Management_SystemBackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/getAllStudentCount")
    public long getStudentCount() {
        return studentService.getStudentCount();
    }

    @GetMapping("/getStudents")
    public List<StudentDTO> getAllStudents(){
        return studentService.getAllStudents();

    }
//    public String getStudent(){
//        return "getStudents Success";
//
//    }

    @PostMapping("/saveStudent")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }
}
