package com.lms.Learning_Management_SystemBackend.model.jwt;

/**
 * model class used to hold response wrapped
 */

public class AuthenticationResponse {

private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }


}
