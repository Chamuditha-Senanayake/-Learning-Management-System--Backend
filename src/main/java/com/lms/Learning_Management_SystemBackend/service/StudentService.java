package com.lms.Learning_Management_SystemBackend.service;

import com.lms.Learning_Management_SystemBackend.dto.StudentDTO;
import com.lms.Learning_Management_SystemBackend.model.Student;
import com.lms.Learning_Management_SystemBackend.repo.StudentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ModelMapper modelMapper;

    public StudentDTO saveStudent(StudentDTO studentDTO){
//       String id= studentRepo.findTopByOrderByStudentIdDesc();
//       int stdID= Integer.parseInt(id.substring(4));
//       studentDTO.setStudentId("EMP-"+(stdID+1));
        Student ss = studentRepo.save(modelMapper.map(studentDTO, Student.class));
        System.out.println(ss);
        return studentDTO;
    }
}
