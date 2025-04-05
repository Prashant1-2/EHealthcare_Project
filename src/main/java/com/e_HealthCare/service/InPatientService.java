package com.e_HealthCare.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.InPatient;
import com.e_HealthCare.repository.InPatientRepository;

@Service
public class InPatientService {

	  private static final Logger logger = LogManager.getLogger(InPatientService.class);

	    @Autowired
	    private InPatientRepository repository;

	    public InPatient saveInPatient(InPatient patient) {
	        logger.info("Saving inpatient: {}", patient);
	        return repository.save(patient);
	    }

	    public List<InPatient> savePatients(List<InPatient> patients) {
	        logger.info("Saving multiple inpatients: {}", patients);
	        return repository.saveAll(patients);
	    }

	    public List<InPatient> getPatients() {
	        logger.info("Fetching all inpatients");
	        return repository.findAll();
	    }

	    public InPatient getPatientById(int id) {
	        logger.info("Fetching inpatient with ID: {}", id);
	        return repository.findById(id).orElse(null);
	    }

	    public InPatient updatePatient(InPatient patient) {
	        logger.info("Updating inpatient: {}", patient);
	        return repository.save(patient);
	    }

	    public String deletePatient(int id) {
	        logger.info("Deleting inpatient with ID: {}", id);
	        repository.deleteById(id);
	        return "Inpatient removed: " + id;
	    }

}
