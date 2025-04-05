package com.e_HealthCare.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Doctor;
import com.e_HealthCare.repository.DoctorRepository;

@Service
public class DoctorService {
	private static final Logger logger = LogManager.getLogger(DoctorService.class);

	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor save(Doctor doctor) {
		logger.info("Saving doctor: {}", doctor);
		return doctorRepository.save(doctor);
	}

	public List<Doctor> getAllDoctors() {
		logger.info("Fetching all doctors");
		return doctorRepository.findAll();
	}

	public void deleteDoctor(int id) {
		logger.info("Deleting doctor with ID: {}", id);
		doctorRepository.deleteById(id);
	}

	public Doctor getDoctorById(int id) {
		logger.info("Fetching doctor with ID: {}", id);
		return doctorRepository.findById(id).orElse(null);
	}

	public Doctor updateDoctor(Doctor doctor) {
		logger.info("Updating doctor: {}", doctor);
		return doctorRepository.save(doctor);
	}

}
