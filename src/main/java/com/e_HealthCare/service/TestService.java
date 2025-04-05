package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Test;
import com.e_HealthCare.repository.TestRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class TestService {
	private static final Logger logger = LogManager.getLogger(TestService.class);

	@Autowired
	private TestRepository repository;

	public Test saveTest(Test test) {
		logger.info("Saving test: {}", test);
		return repository.save(test);
	}

	public Test getTestById(int id) {
		logger.info("Fetching test with ID: {}", id);
		return repository.findById(id).orElse(null);
	}

	public List<Test> getTests() {
		logger.info("Fetching all tests");
		return repository.findAll();
	}

	public Test updateTest(Test test) {
		logger.info("Updating test: {}", test);
		return repository.save(test);
	}

	public String deleteTest(int id) {
		logger.info("Deleting test with ID: {}", id);
		repository.deleteById(id);
		return "Test removed " + id;
	}
}
