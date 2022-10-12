package com.lms.Learning_Management_SystemBackend.service;

import com.lms.Learning_Management_SystemBackend.repo.AnnouncementRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementService {
    @Autowired
    private AnnouncementRepo announcementRepo;
    @Autowired
    private ModelMapper modelMapper;

}
