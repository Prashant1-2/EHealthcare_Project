package com.e_HealthCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_HealthCare.entity.Test;
import com.e_HealthCare.repository.TestRepository;

@Service
public class TestService {
	@Autowired
	private TestRepository repository;

	public Test saveTest(Test Test) {
		return repository.save(Test);
	}

	public Test getTestById(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Test> getTests() {

		return repository.findAll();
	}

	public Test updateTest(Test Test) {
		return repository.save(Test);
	}

	public String deleteTest(int id) {
		repository.deleteById(id);
		return "Test removed " + id;
	}

}
