package com.lms.Learning_Management_SystemBackend.repo;

import com.lms.Learning_Management_SystemBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findDistinctByEmail(String email);
    User getUserById(int id);
    User findUserByEmailAndPassword(String email,String password);
}
