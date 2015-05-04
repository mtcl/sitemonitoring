package com.mtcl.sitemonitoring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtcl.sitemonitoring.entity.Check;
import com.mtcl.sitemonitoring.repository.CheckRepository;

@Service
public class CheckService {

	@Autowired
	private CheckRepository checkRepository;

	public List<Check> findAll() {
		return checkRepository.findAll();
	}

	public void save(Check check) {
		checkRepository.save(check);

	}

}
