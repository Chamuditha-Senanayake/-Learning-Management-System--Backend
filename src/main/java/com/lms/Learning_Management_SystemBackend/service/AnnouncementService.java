package com.lms.Learning_Management_SystemBackend.service;

import com.lms.Learning_Management_SystemBackend.dto.AnnouncementDTO;
import com.lms.Learning_Management_SystemBackend.dto.CourseDTO;
import com.lms.Learning_Management_SystemBackend.model.Announcement;
import com.lms.Learning_Management_SystemBackend.model.Course;
import com.lms.Learning_Management_SystemBackend.repo.AnnouncementRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {
    @Autowired
    private AnnouncementRepo announcementRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<AnnouncementDTO> getAllAnnouncement() {
        List<Announcement> announcementList = announcementRepo.findAll();
        return modelMapper.map(announcementList, new TypeToken<List<AnnouncementDTO>>(){}.getType());
    }

    public AnnouncementDTO saveAnnouncement(AnnouncementDTO announcementDTO) {
        announcementRepo.save(modelMapper.map(announcementDTO, Announcement.class));
        return announcementDTO;
    }
}
