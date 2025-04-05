package com.e_HealthCare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.OutPatient;
import com.e_HealthCare.repository.OutPatientRepository;

import java.util.List;

@Service
public class OutPatientService {

    private final OutPatientRepository outPatientRepository;

    @Autowired
    public OutPatientService(OutPatientRepository outPatientRepository) {
        this.outPatientRepository = outPatientRepository;
    }

    public List<OutPatient> getAllOutPatients() {
        return outPatientRepository.findAll();
    }

    public OutPatient getOutPatientById(int id) {
        return outPatientRepository.findById(id).orElse(null);
    }

    public OutPatient saveOutPatient(OutPatient outPatient) {
        return outPatientRepository.save(outPatient);
    }

    public void deleteOutPatient(int id) {
        outPatientRepository.deleteById(id);
    }

    public OutPatient updateOutPatient(int id, OutPatient updatedOutPatient) {
        if (outPatientRepository.existsById(id)) {
            updatedOutPatient.setId(id);
            return outPatientRepository.save(updatedOutPatient);
        }
        return null;
    }
}

