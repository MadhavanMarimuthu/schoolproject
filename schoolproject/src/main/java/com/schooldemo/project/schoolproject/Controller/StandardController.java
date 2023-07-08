package com.schooldemo.project.schoolproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.schooldemo.project.schoolproject.Entity.StandardEntity;
import com.schooldemo.project.schoolproject.Enum.Status;
import com.schooldemo.project.schoolproject.Service.StandardService;

@Controller
@RequestMapping(value="/standard")
public class StandardController {
	
	@Autowired
	public StandardService standardService;
	


	@PostMapping(value="/post", produces = "application/json")
	private ResponseEntity<String> post(@RequestBody StandardEntity standardEntity){
	
		StandardEntity stdobj=new StandardEntity();
		stdobj.setId(standardEntity.getId());
		stdobj.setName(standardEntity.getName());
		stdobj.setStatus(Status.ACTIVE);
		standardService.create(stdobj);
		return ResponseEntity.ok( "insert sucessfully");
		
	}
	

}
