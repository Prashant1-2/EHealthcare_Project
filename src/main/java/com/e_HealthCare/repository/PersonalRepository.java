package com.e_HealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.e_HealthCare.entity.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal,Integer> {

//	@Query(value ="select * from PDETAILS", nativeQuery =true)
//	Personal findByName(String first_name);
//	
//	Personal findByNameNative(String first_name);
	@Query(value ="select * from PDETAILS p where p.username = :username", nativeQuery =true)
	Personal findByUsername(@Param("username") String username);
	
//	 @Query("Select u from PDETAILS u WHERE u.username=:username")    
//	 Personal findByUsername(@Param("username") String username, nativeQuery =true);
	
}
