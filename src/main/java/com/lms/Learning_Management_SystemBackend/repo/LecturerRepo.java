package com.lms.Learning_Management_SystemBackend.repo;

import com.lms.Learning_Management_SystemBackend.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepo extends JpaRepository<Lecturer, Integer> {
}
