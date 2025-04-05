package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.InPatient;
import com.e_HealthCare.repository.InPatientRepository;

@Service
public class InPatientService {

	@Autowired
	private InPatientRepository repository;

	public InPatient saveInPatient(InPatient patient) {
		return repository.save(patient);
	}

	public List<InPatient> savePatients(List<InPatient> patient) {
		return repository.saveAll(patient);
	}

	public List<InPatient> getPatients() {
		return repository.findAll();
	}

	public InPatient getPatientById(int id) {
		return repository.findById(id).orElse(null);
	}

	public InPatient updatePatient(InPatient patient) {
		return repository.save(patient);
	}

	public String deletePatient(int id) {
		repository.deleteById(id);
		return "product removed !! " + id;
	}

}
