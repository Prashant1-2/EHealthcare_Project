package com.e_HealthCare.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

import com.e_HealthCare.entity.InPatient;
import com.e_HealthCare.service.InPatientService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/inpatient")
public class InPatientController {

	private static final Logger logger = LogManager.getLogger(InPatientController.class);
	@Autowired
	private InPatientService service;

	@PostMapping("/addpatient")
	public InPatient addPatient(@RequestBody InPatient patient) {
		logger.info("Adding a new in-patient: {}", patient);
		return service.saveInPatient(patient);
	}

	@GetMapping("/patients")
	public List<InPatient> findAllPatients() {
		logger.info("Fetching all in-patients");
		return service.getPatients();
	}

	@GetMapping("/patientById/{id}")
	public InPatient findPatientById(@PathVariable int id) {
		logger.info("Fetching in-patient with ID: {}", id);
		return service.getPatientById(id);
	}

	@PutMapping("/updateproduct/{id}")
	public InPatient updatePatient(@RequestBody InPatient patient) {
		logger.info("Updating in-patient: {}", patient);
		return service.updatePatient(patient);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable int id) {
		logger.info("Deleting in-patient with ID: {}", id);
		return service.deletePatient(id);
	}

}
