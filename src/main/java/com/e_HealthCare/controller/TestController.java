package com.e_HealthCare.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private static final Logger logger = LogManager.getLogger(TestController.class);

	@Autowired
	private TestService service;

	@PostMapping("/addTest")
	public Test addTest(@RequestBody Test test) {
		return service.saveTest(test);
	}

	@GetMapping("/Tests")
	public List<Test> findAllTests() {
		logger.info("Fetching all tests");
		return service.getTests();
	}

	@GetMapping("/TestById/{id}")
	public Test findTestById(@PathVariable int id) {
		logger.info("Fetching test with ID: {}", id);
		return service.getTestById(id);
	}

	@PutMapping("/update/{id}")
	public Test updateTest(@RequestBody Test test) {
		logger.info("Updating test: {}", test);
		return service.updateTest(test);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTest(@PathVariable int id) {
		logger.info("Deleting test with ID: {}", id);
		return service.deleteTest(id);
	}
}
