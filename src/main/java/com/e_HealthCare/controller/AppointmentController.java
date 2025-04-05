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

import com.e_HealthCare.entity.Appointment;
import com.e_HealthCare.service.AppointmentService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/appointments")
public class AppointmentController {

	private static final Logger logger = LogManager.getLogger(AppointmentController.class);
	
	@Autowired
	private AppointmentService service;

	@PostMapping("/pmapt")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		logger.info("Creating appointment: {}", appointment);
		return service.createAppointment(appointment);
	}

	@GetMapping("/gmapt")
	public List<Appointment> getAllAppointments() {
		logger.info("Fetching all appointments");
		return service.getAllAppointments();
	}

	@GetMapping("/apptbid/{id}")
	public Appointment getAppointmentById(@PathVariable int id) {
		logger.info("Fetching appointment with ID: {}", id);
		return service.getAppointmentById(id);
	}

	@PutMapping("/modapptbid/{id}")
	public Appointment modifyAppointment(@RequestBody Appointment appointment) {
		logger.info("Modifying appointment: {}", appointment);
		return service.modifyAppointment(appointment);
	}

	@DeleteMapping("/delapptbid/{id}")
	public String removeAppointment(@PathVariable int id) {
		logger.info("Removing appointment with ID: {}", id);
		return service.removeAppointment(id);
	}

}
