package com.schooldemo.project.schoolproject.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@PostMapping("/post")
	public void create() {
		
	}
	

}
