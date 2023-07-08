package com.schooldemo.project.schoolproject.Service;

import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooldemo.project.schoolproject.Entity.FacultyEntity;
import com.schooldemo.project.schoolproject.Entity.UserLogin;
import com.schooldemo.project.schoolproject.Repository.FacultyRepository;
import com.schooldemo.project.schoolproject.Repository.UserloginRepository;

import lombok.NonNull;

@Service
@Transactional
public class FacultyService {

	@Autowired
	private @NonNull FacultyRepository facultyRepository;
	
	@Autowired
	public @NonNull UserloginRepository userloginRepository;

//	public FacultyEntity saveOrUpdate(FacultyEntity faculty) {
//		return facultyRepository.save(faculty);
//
//	}

	public Iterable<FacultyEntity> findAll() {
		
		return facultyRepository.findAll();
	}

	public Optional<FacultyEntity> findById(UUID facultyid) {
		return  facultyRepository.findById(facultyid);
	
	}

	public void save(UserLogin user,FacultyEntity facultyEntity) {
		user.setReferenceId(facultyEntity.getFacultyId());
       userloginRepository.save(user);
		facultyRepository.save(facultyEntity);
	}

	public void delete(UUID facultyId) {
		facultyRepository.deleteById(facultyId);
		
	}

}
