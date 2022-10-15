package com.lms.Learning_Management_SystemBackend.controller;


import com.lms.Learning_Management_SystemBackend.dto.CourseDTO;
import com.lms.Learning_Management_SystemBackend.dto.UserDTO;
import com.lms.Learning_Management_SystemBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{email}/{password}")
    public UserDTO getUserByEmailAndPassword(@PathVariable("email") String email,@PathVariable("password") String password){
        return userService.getUserByEmailAndPassword(email,password);
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
}
