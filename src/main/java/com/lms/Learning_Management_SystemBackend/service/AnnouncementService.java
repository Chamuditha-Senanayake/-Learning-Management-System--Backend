package com.lms.Learning_Management_SystemBackend.service;

import com.lms.Learning_Management_SystemBackend.dto.AnnouncementDTO;
import com.lms.Learning_Management_SystemBackend.model.Announcement;
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

    @Autowired
    private CourseService courseService;

    public List<AnnouncementDTO> getAllAnnouncement() {
        List<Announcement> announcementList = announcementRepo.findAll();
        return modelMapper.map(announcementList, new TypeToken<List<AnnouncementDTO>>(){}.getType());
    }

    public AnnouncementDTO saveAnnouncement(AnnouncementDTO announcementDTO) {
        Announcement announcement = new Announcement();
        announcement.setCourse(courseService.getCourseByCourseId(announcementDTO.getCourseId()));
        announcement.setTitle(announcementDTO.getTitle());
        announcement.setState(announcementDTO.getState());
        announcement.setDescription(announcementDTO.getDescription());
        announcement.setUpdated_date(announcementDTO.getUpdated_date());
        announcementRepo.save(announcement);
        // announcementRepo.save(modelMapper.map(announcementDTO, Announcement.class));
        return announcementDTO;
    }

    public Announcement getAnnouncement(int id){
        return announcementRepo.findById(id).get();
    }
    public AnnouncementDTO updateAnnouncement(int id, AnnouncementDTO announcementDTO) {
        Announcement announcement = getAnnouncement(id) ;
        announcement.setCourse(courseService.getCourseByCourseId(announcementDTO.getCourseId()));
        announcement.setTitle(announcementDTO.getTitle());
        announcement.setState(announcementDTO.getState());
        announcement.setDescription(announcementDTO.getDescription());
        announcement.setUpdated_date(announcementDTO.getUpdated_date());
        announcementRepo.save(announcement);
        // announcementRepo.save(modelMapper.map(announcementDTO, Announcement.class));
        return announcementDTO;
    }


    public void deleteAnnouncement(int id){
        announcementRepo.deleteById(id);
    }
}
