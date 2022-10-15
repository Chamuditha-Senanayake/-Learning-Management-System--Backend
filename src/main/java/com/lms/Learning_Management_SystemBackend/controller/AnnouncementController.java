package com.lms.Learning_Management_SystemBackend.controller;


import com.lms.Learning_Management_SystemBackend.dto.AnnouncementDTO;
import com.lms.Learning_Management_SystemBackend.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/announcement")
@CrossOrigin
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;


    @GetMapping("/getAllAnnouncements")
    public List<AnnouncementDTO> getAllAnnouncement(){
        return announcementService.getAllAnnouncement();
    }

    @PostMapping("/saveAnnouncement")
    public AnnouncementDTO saveAnnouncement(@RequestBody AnnouncementDTO announcementDTO){
        return announcementService.saveAnnouncement(announcementDTO);
    }
}
