package com.e_HealthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_HealthCare.entity.Doctor;
import com.e_HealthCare.service.DoctorService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/doctors")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@PostMapping("/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorService.save(doctor);
	}

	@GetMapping("/Doctors")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}

	@GetMapping("/DoctorById/{id}")
	public Doctor getDoctorById(@PathVariable int id) {
		return doctorService.getDoctorById(id);
	}

	@PutMapping("/update/{id}")
	public Doctor updateDoctor(@RequestBody Doctor Doctor) {
		return doctorService.updateDoctor(Doctor);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteDoctor(@PathVariable int id) {
		doctorService.deleteDoctor(id);
	}
}
