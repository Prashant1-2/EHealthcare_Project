package com.e_HealthCare.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Appointment;
import com.e_HealthCare.repository.AppointmentRepository;

@Service
public class AppointmentService {

	private static final Logger logger = LogManager.getLogger(AppointmentService.class);

	@Autowired
	private AppointmentRepository repository;

	public Appointment createAppointment(Appointment appointment) {
		logger.info("Creating a new appointment: {}", appointment);
		return repository.save(appointment);
	}

	public List<Appointment> createAppointments(List<Appointment> appointments) {
		logger.info("Creating multiple appointments: {}", appointments);
		return repository.saveAll(appointments);
	}

	public List<Appointment> getAllAppointments() {
		logger.info("Fetching all appointments");
		return repository.findAll();
	}

	public Appointment getAppointmentById(int id) {
		logger.info("Fetching appointment with ID: {}", id);
		return repository.findById(id).orElse(null);
	}

	public Appointment modifyAppointment(Appointment appointment) {
		logger.info("Modifying appointment: {}", appointment);
		return repository.save(appointment);
	}

	public String removeAppointment(int id) {
		logger.info("Removing appointment with ID: {}", id);
		repository.deleteById(id);
		return "Appointment removed: " + id;
	}

}