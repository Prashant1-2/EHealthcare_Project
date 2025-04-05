package com.e_HealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_HealthCare.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}

