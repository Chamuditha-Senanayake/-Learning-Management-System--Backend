package com.lms.Learning_Management_SystemBackend.service;

import com.lms.Learning_Management_SystemBackend.dto.LecturerDTO;
import com.lms.Learning_Management_SystemBackend.dto.StudentDTO;
import com.lms.Learning_Management_SystemBackend.dto.UserDTO;
import com.lms.Learning_Management_SystemBackend.model.User;
import com.lms.Learning_Management_SystemBackend.repo.StudentRepo;
import com.lms.Learning_Management_SystemBackend.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private StudentService studentService;

    @Autowired
    private LecturerService lecturerService;

    @Autowired
    private ModelMapper modelMapper;


    public UserDTO getUserByEmailAndPassword(String email,String password){
        User user = userRepo.findUserByEmailAndPassword(email,password);
        System.out.println("hdond");
        return modelMapper.map(user,UserDTO.class);
    }
    public UserDTO saveUser(UserDTO userDTO){
        User user = userRepo.save(modelMapper.map(userDTO, User.class));
        System.out.println(user);
        if(user.getRole().equalsIgnoreCase("Student")){
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setStudentId("STD-"+user.getId());
            studentDTO.setUserStudent(user);
            studentService.saveStudent(studentDTO);
        }else{
            LecturerDTO lecturerDTO= new LecturerDTO();
            lecturerDTO.setLecturerId("LEC-"+user.getId());
            lecturerDTO.setUserLecturer(user);
            lecturerService.saveLecturer(lecturerDTO);
        }

        return userDTO;
    }
}
