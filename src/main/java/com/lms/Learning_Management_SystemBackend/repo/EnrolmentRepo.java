package com.lms.Learning_Management_SystemBackend.repo;

import com.lms.Learning_Management_SystemBackend.model.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrolmentRepo extends JpaRepository<Enrolment, Integer> {
}
