package com.lms.Learning_Management_SystemBackend.service.jwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
    * This class is used to authenticate the user
    * check user presence
    * return one user
 */


import java.util.ArrayList;
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //in here we give parameters which we should compare username and password
        // only file need to change is this in ths project to implement jwt
        return new User("foo","foo",new ArrayList<>());
    }
}
