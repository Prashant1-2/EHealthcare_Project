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

import com.e_HealthCare.entity.Test;
import com.e_HealthCare.service.TestService;

	
	@CrossOrigin(origins = "*")
	@RestController
	@RequestMapping("/test")
	public class TestController {

		@Autowired
		private TestService service;

		@PostMapping("/addTest")
		public Test addTest(@RequestBody Test Test) {
			return service.saveTest(Test);
		}


		@GetMapping("/Tests")
		public List<Test> findAllTests() {
			return service.getTests();
		}

		@GetMapping("/TestById/{id}")
		public Test findTestById(@PathVariable int id) {
			return service.getTestById(id);
		}


			@PutMapping("/update/{id}")
			public Test updateTest(@RequestBody Test Test)
			{
				return service.updateTest(Test);
			}
		


		@DeleteMapping("/delete/{id}")
		public String deleteTest(@PathVariable int id) {
			return service.deleteTest(id);
		}


}
