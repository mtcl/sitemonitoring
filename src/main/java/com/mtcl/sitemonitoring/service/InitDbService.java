package com.mtcl.sitemonitoring.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtcl.sitemonitoring.entity.Check;
import com.mtcl.sitemonitoring.repository.CheckRepository;

@Service
public class InitDbService {

	@Autowired
	private CheckRepository checkRepository;

	@PostConstruct
	public void init() {
		System.out.println("************** INIT DB Start **************");
		{
			Check check = new Check();
			check.setName("example");
			check.setUrl("http://www.example.com");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("mtcl");
			check.setUrl("http://www.mtcl.com");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("sitemonitoring");
			check.setUrl("http://www.sitemonitoring.com");
			checkRepository.save(check);
		}
		System.out.println("************** INIT DB End **************");
	}
}
