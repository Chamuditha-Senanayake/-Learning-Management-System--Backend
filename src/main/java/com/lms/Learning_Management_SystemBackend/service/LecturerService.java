package com.lms.Learning_Management_SystemBackend.service;

import com.lms.Learning_Management_SystemBackend.dto.LecturerDTO;
import com.lms.Learning_Management_SystemBackend.model.Lecturer;
import com.lms.Learning_Management_SystemBackend.repo.LecturerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LecturerService {

    @Autowired
    private LecturerRepo lecturerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public LecturerDTO saveLecturer(LecturerDTO lecturerDTO){
        lecturerRepo.save(modelMapper.map(lecturerDTO, Lecturer.class));
        return lecturerDTO;
    }

    public long getLecturerCount() {
        return lecturerRepo.count();
    }
}
