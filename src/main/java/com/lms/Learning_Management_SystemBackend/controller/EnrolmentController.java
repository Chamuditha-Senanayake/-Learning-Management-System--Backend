package com.lms.Learning_Management_SystemBackend.controller;


import com.lms.Learning_Management_SystemBackend.dto.AnnouncementDTO;
import com.lms.Learning_Management_SystemBackend.dto.CourseDTO;
import com.lms.Learning_Management_SystemBackend.dto.EnrolmentDTO;
import com.lms.Learning_Management_SystemBackend.repo.EnrolmentRepo;
import com.lms.Learning_Management_SystemBackend.service.CourseService;
import com.lms.Learning_Management_SystemBackend.service.EnrolmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/enrolment")
@CrossOrigin
public class EnrolmentController {

    @Autowired
    private EnrolmentService enrolmentService;

    @PostMapping("/saveEnrolment")
    public EnrolmentDTO saveAnnouncement(@RequestBody EnrolmentDTO enrolmentDTO){
        return enrolmentService.saveEnrolment(enrolmentDTO);
    }

    @GetMapping("/getAllEnrolments")
    public List<EnrolmentDTO> getAllAnnouncement(){
        return enrolmentService.getAllEnrolment();
    }



}
