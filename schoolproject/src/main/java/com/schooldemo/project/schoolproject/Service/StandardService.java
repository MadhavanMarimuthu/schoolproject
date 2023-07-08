package com.schooldemo.project.schoolproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldemo.project.schoolproject.Entity.StandardEntity;
import com.schooldemo.project.schoolproject.Repository.StandardRepository;

@Service
public class StandardService {
	
	@Autowired
	public StandardRepository standardRepository;

	public void create(StandardEntity standardEntity) {
		standardRepository.save(standardEntity);
		
		
	}

}
