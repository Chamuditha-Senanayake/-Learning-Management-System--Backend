package com.lms.Learning_Management_SystemBackend.service;


import com.lms.Learning_Management_SystemBackend.dto.AnnouncementDTO;
import com.lms.Learning_Management_SystemBackend.dto.EnrolmentDTO;
import com.lms.Learning_Management_SystemBackend.model.Announcement;
import com.lms.Learning_Management_SystemBackend.model.Enrolment;
import com.lms.Learning_Management_SystemBackend.repo.EnrolmentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrolmentService {

    @Autowired
    private EnrolmentRepo enrolmentRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CourseService courseService;

    @Autowired
    private UserService userService;

    public EnrolmentDTO saveEnrolment(EnrolmentDTO enrolmentDTO) {
        Enrolment enrolment = new Enrolment();
        enrolment.setNote(enrolmentDTO.getNote());
        enrolment.setMarks(enrolmentDTO.getMarks());
        enrolment.setState(enrolmentDTO.getState());
        enrolment.setCourses(courseService.getCourseByCourseId(enrolmentDTO.getCoursesId()));
        enrolment.setUser(userService.getUserById(enrolmentDTO.getUserId()));
        return enrolmentDTO;
    }


    public List<EnrolmentDTO> getAllEnrolment() {
            List<Enrolment> enrolmentList = enrolmentRepo.findAll();
            return modelMapper.map(enrolmentList, new TypeToken<List<EnrolmentDTO>>(){}.getType());
    }
}
