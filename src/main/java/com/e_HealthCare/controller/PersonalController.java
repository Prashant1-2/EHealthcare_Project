package com.e_HealthCare.controller;

import java.util.List;

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

import com.e_HealthCare.entity.Personal;
import com.e_HealthCare.service.PersonalService;





@RestController
@RequestMapping("/personal")
@CrossOrigin(origins = "*")
public class PersonalController {

	@Autowired
	private PersonalService service;

	@PostMapping("/adduser")
	public Personal adduser(@RequestBody Personal personal) {
		return service.saveuser(personal);
	}

	@PostMapping("/addusers")
	public List<Personal> addusers(@RequestBody List<Personal> personals) {
		return service.saveusers(personals);
	}

	@GetMapping("/users")
	public List<Personal> findallusers() {
		return service.getusers();
	}

	@GetMapping("/userbyid/{id}")
	public Personal finduserbyid(@PathVariable int id) {
		return service.getuserbyid(id);
	}

	@PutMapping("/updatepersonal/{id}")
	public Personal updateuser(@RequestBody Personal personal) {
		return service.updateuser(personal);}
		
		@PutMapping("/updatePersonalByUsername/{username}")
		public Personal updateuserByUserName(@RequestBody Personal personal) {
			return service.updateuserByUserName(personal);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteuser(@PathVariable int id) {
		return service.deleteuser(id);
	}
//	@GetMapping("/user/{name}")
//	public Personal findUserByName(@PathVariable String name) {
//		return service.getUserByName(name);}

	@GetMapping("/username1/{username}")
	public Personal findUserByUserName(@PathVariable String username) {
		return service.getUserByUserName(username);}


}
