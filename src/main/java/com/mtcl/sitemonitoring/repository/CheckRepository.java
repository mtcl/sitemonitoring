package com.mtcl.sitemonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtcl.sitemonitoring.entity.Check;

public interface CheckRepository extends JpaRepository<Check, Integer>{

}
