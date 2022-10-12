package com.lms.Learning_Management_SystemBackend.service;


import com.lms.Learning_Management_SystemBackend.repo.EnrolmentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrolmentService {

    @Autowired
    private EnrolmentRepo enrolmentRepo;
    @Autowired
    private ModelMapper modelMapper;

}
