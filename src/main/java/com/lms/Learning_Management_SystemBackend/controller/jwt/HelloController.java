//our controller class Hello Controller which exposes a Get endpoint
//Api behind Authentication
//Only Authenticated users can access

package com.lms.Learning_Management_SystemBackend.controller.jwt;

import com.lms.Learning_Management_SystemBackend.model.jwt.AuthenticationRequest;
import com.lms.Learning_Management_SystemBackend.model.jwt.AuthenticationResponse;
import com.lms.Learning_Management_SystemBackend.service.jwt.MyUserDetailsService;
import com.lms.Learning_Management_SystemBackend.util.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    MyUserDetailsService userDetailsService;

    @Autowired
    JwtUtil jwtTokenUtil;

    /**
     * method used for testing purposes
     * */

    @RequestMapping({"/hello"})
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = {"api/v1/authenticate"} , method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken
                    (authenticationRequest.getUsername(),authenticationRequest.getPassword()));
        }catch(BadCredentialsException e){

            throw new Exception("Incorrect username or password", e);
            
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
