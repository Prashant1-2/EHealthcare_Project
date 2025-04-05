package com.e_HealthCare.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.OutPatient;
import com.e_HealthCare.repository.OutPatientRepository;

import java.util.List;

@Service
public class OutPatientService {

	private static final Logger logger = LogManager.getLogger(OutPatientService.class);

	private final OutPatientRepository outPatientRepository;

	@Autowired
	public OutPatientService(OutPatientRepository outPatientRepository) {
		this.outPatientRepository = outPatientRepository;
	}

	public List<OutPatient> getAllOutPatients() {
		logger.info("Fetching all outpatients");
		return outPatientRepository.findAll();
	}

	public OutPatient getOutPatientById(int id) {
		logger.info("Fetching outpatient with ID: {}", id);
		return outPatientRepository.findById(id).orElse(null);
	}

	public OutPatient saveOutPatient(OutPatient outPatient) {
		logger.info("Saving outpatient: {}", outPatient);
		return outPatientRepository.save(outPatient);
	}

	public void deleteOutPatient(int id) {
		logger.info("Deleting outpatient with ID: {}", id);
		outPatientRepository.deleteById(id);
	}

	public OutPatient updateOutPatient(int id, OutPatient updatedOutPatient) {
		if (outPatientRepository.existsById(id)) {
			logger.info("Updating outpatient with ID: {}", id);
			updatedOutPatient.setId(id);
			return outPatientRepository.save(updatedOutPatient);
		}
		logger.warn("Outpatient with ID: {} not found", id);
		return null;
	}
}
