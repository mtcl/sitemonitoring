package com.mtcl.sitemonitoring.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import lombok.Getter;
import lombok.Setter;

import com.mtcl.sitemonitoring.entity.Check;
import com.mtcl.sitemonitoring.service.CheckService;

@ManagedBean
@Getter
@Setter
public class CheckListController {

	@ManagedProperty("#{checkService}")
	private CheckService checkService;

	private List<Check> checks;

	private Check check = new Check();

	@PostConstruct
	public void loadChecks() {
		checks = checkService.findAll();
	}

	public void save() {
		checkService.save(check);
	}

}
