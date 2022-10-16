package com.lms.Learning_Management_SystemBackend.service;

import com.lms.Learning_Management_SystemBackend.dto.CourseDTO;
import com.lms.Learning_Management_SystemBackend.model.Course;
import com.lms.Learning_Management_SystemBackend.repo.CourseRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private ModelMapper modelMapper;

    public CourseDTO saveCourse(CourseDTO courseDTO){
        courseRepo.save(modelMapper.map(courseDTO, Course.class));
        return courseDTO;
    }

    public List<CourseDTO> getAllCourses(){
//        return courseRepo.findAll();
        List<Course> courseList = courseRepo.findAll();
        return modelMapper.map(courseList, new TypeToken<List<CourseDTO>>(){}.getType());
    }


    public Course getCourseByCourseId(String courseId){
        return courseRepo.getCourseByCourseId(courseId);
    }


//    public CourseDTO getCourseById(String courseId) {
//        return courseRepo.findCourseByCourseId();
//    }
}
