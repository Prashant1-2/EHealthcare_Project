package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Personal;
import com.e_HealthCare.entity.UserRegistration;
import com.e_HealthCare.repository.PersonalRepository;

@Service
public class PersonalService {

	@Autowired
	private PersonalRepository repository;

	public Personal saveuser(Personal personal) {
		return repository.save(personal);
	}

	public List<Personal> saveusers(List<Personal> personals) {
		return repository.saveAll(personals);
	}

	public List<Personal> getusers() {
		return repository.findAll();
	}

	public Personal getuserbyid(int id) {
		return repository.findById(id).orElse(null);
	}

	//public Personal getUserByName(String name) {return repository.findByNameNative(name);}

	public Personal updateuser(Personal personal) {return repository.save(personal) ;	}

	public String deleteuser(int id) {repository.deleteById(id); return "product removed !! " +id;}

	public Personal getUserByUserName(String username) {return repository.findByUsername(username);
	}

	public Personal updateuserByUserName(Personal personal) {return repository.save(personal);
	}

//	public Personal updateuser(Personal personal) {
//		return repository.save(personal);
//	}
//
//	public String deleteuser(int id) {
//		repository.deleteById(id);
//		return "product removed !! " + id;
//	}

}
