package com.lms.Learning_Management_SystemBackend.controller;

import com.lms.Learning_Management_SystemBackend.dto.LecturerDTO;
import com.lms.Learning_Management_SystemBackend.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/lecturer")
@CrossOrigin
public class LecturerController {

    @Autowired
    private LecturerService lecturerService;

    @PostMapping("/saveLecturer")
    public LecturerDTO saveLecturer(@RequestBody LecturerDTO lecturerDTO){
        return lecturerService.saveLecturer(lecturerDTO);
    }

    @GetMapping("/getAllLecturerCount")
    public long getLecturerCount(){
        return lecturerService.getLecturerCount();
    }

}
