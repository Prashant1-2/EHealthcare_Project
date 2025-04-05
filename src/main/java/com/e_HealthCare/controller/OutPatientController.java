package com.e_HealthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.e_HealthCare.entity.InputOutpatient;
import com.e_HealthCare.entity.OutPatient;
import com.e_HealthCare.entity.OutPatientResponse;
import com.e_HealthCare.service.OutPatientService;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/outpatients")
public class OutPatientController {

    private final OutPatientService outPatientService;

    @Autowired
    public OutPatientController(OutPatientService outPatientService) {
        this.outPatientService = outPatientService;
    }

    @GetMapping("/all")
    public List<OutPatient> getAllOutPatients() {
        return outPatientService.getAllOutPatients();
    }

    @GetMapping("/{id}")
    public OutPatient getOutPatientById(@PathVariable int id) {
        return outPatientService.getOutPatientById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<OutPatientResponse> createOutPatient(@RequestBody InputOutpatient inputOutPatient) {
        OutPatient outPatient = new OutPatient();
        
        outPatient.setId(inputOutPatient.getInputId());
        outPatient.setPatientName(inputOutPatient.getInputPatientName());
        outPatient.setPhoneNumber(inputOutPatient.getInputPhoneNumber());
        outPatient.setEmail(inputOutPatient.getInputEmail());
        outPatient.setDateOfAppointment(inputOutPatient.getInputDateOfAppointment());
        outPatient.setTimeSlot(inputOutPatient.getInputTimeSlot());
        outPatient.setDob(inputOutPatient.getInputDateOfBirth());
        outPatient.setDisease(inputOutPatient.getInputDisease());
        outPatient.setDoctorName(inputOutPatient.getInputDoctorName());


        // Attempt to save the outPatient to the database
        OutPatient savedOutPatient = outPatientService.saveOutPatient(outPatient);

        if (savedOutPatient != null) {
            OutPatientResponse response = new OutPatientResponse();
            response.setMessage("Outpatient created successfully");
            response.setId(savedOutPatient.getId());
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateOutPatient(@PathVariable int id, @RequestBody InputOutpatient inputOutPatient) {
        // Retrieve the existing OutPatient by ID
        OutPatient existingOutPatient = outPatientService.getOutPatientById(id);

        if (existingOutPatient != null) {
            // Update the properties of the existing OutPatient with the new values
        	
            existingOutPatient.setId(inputOutPatient.getInputId());
            existingOutPatient.setPatientName(inputOutPatient.getInputPatientName());
            existingOutPatient.setPhoneNumber(inputOutPatient.getInputPhoneNumber());
            existingOutPatient.setEmail(inputOutPatient.getInputEmail());
            existingOutPatient.setDateOfAppointment(inputOutPatient.getInputDateOfAppointment());
            existingOutPatient.setTimeSlot(inputOutPatient.getInputTimeSlot());
            existingOutPatient.setDob(inputOutPatient.getInputDateOfBirth());
            existingOutPatient.setDisease(inputOutPatient.getInputDisease());
            existingOutPatient.setDoctorName(inputOutPatient.getInputDoctorName());
            
            // Attempt to save the updated OutPatient to the database
            OutPatient updatedOutPatient = outPatientService.updateOutPatient(id, existingOutPatient);

            if (updatedOutPatient != null) {
                // If the update was successful, return a success response
                return ResponseEntity.ok("Outpatient updated successfully");
            } else {
                // If the update was not successful, return an error response
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update Outpatient");
            }
        } else {
            // Return a not found response if the OutPatient with the given ID does not exist
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Outpatient with ID " + id + " not found");
        }
    }


    @DeleteMapping("/{id}")
    public void deleteOutPatient(@PathVariable int id) {
        outPatientService.deleteOutPatient(id);
    }
}


