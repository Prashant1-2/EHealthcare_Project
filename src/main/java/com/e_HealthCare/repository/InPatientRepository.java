package com.e_HealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.e_HealthCare.entity.InPatient;

@Repository
public interface InPatientRepository extends JpaRepository<InPatient,Integer> {

	@Query(value ="select * from e_healthcare_inpatient1", nativeQuery =true)
	InPatient findByName(int ipid);
	InPatient findByNameNative(int ipid);
}
