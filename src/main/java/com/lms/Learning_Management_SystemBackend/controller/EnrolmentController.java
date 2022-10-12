package com.lms.Learning_Management_SystemBackend.controller;


import com.lms.Learning_Management_SystemBackend.repo.EnrolmentRepo;
import com.lms.Learning_Management_SystemBackend.service.EnrolmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/enrolment")
@CrossOrigin
public class EnrolmentController {

    @Autowired
    private EnrolmentService enrolmentService;
}
