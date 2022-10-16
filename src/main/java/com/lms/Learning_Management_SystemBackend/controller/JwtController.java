package com.lms.Learning_Management_SystemBackend.controller;

import com.lms.Learning_Management_SystemBackend.model.JwtRequest;
import com.lms.Learning_Management_SystemBackend.model.JwtResponse;
import com.lms.Learning_Management_SystemBackend.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}
