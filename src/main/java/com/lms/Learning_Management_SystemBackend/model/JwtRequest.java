package com.lms.Learning_Management_SystemBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class JwtRequest {
    private String email;
    private String userPassword;
}
