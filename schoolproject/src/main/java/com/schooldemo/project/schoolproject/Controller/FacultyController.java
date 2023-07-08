package com.schooldemo.project.schoolproject.Controller;

import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schooldemo.project.schoolproject.Dto.FacultyDto;
import com.schooldemo.project.schoolproject.Entity.CityEntity;
import com.schooldemo.project.schoolproject.Entity.CountryEntity;
import com.schooldemo.project.schoolproject.Entity.DepartmentEntity;
import com.schooldemo.project.schoolproject.Entity.FacultyEntity;
import com.schooldemo.project.schoolproject.Entity.StandardEntity;
import com.schooldemo.project.schoolproject.Entity.StateEntity;
import com.schooldemo.project.schoolproject.Entity.UserLogin;
import com.schooldemo.project.schoolproject.Enum.Status;
import com.schooldemo.project.schoolproject.Security.PasswordUtil;
import com.schooldemo.project.schoolproject.Service.FacultyService;

import lombok.NonNull;


@RestController
@Transactional
@RequestMapping(value="/facultyregister")
public class FacultyController {

	
		@Autowired
		private @NonNull FacultyService facultyService;
		
		
		
		@GetMapping("/get")
		public Iterable<FacultyEntity> findAll() {
			return facultyService.findAll();
			 
		}
		
		
		@GetMapping("/getbyid/{facultyid}")
		public Optional<FacultyEntity> findbyid(@PathVariable UUID facultyid) {
			return facultyService.findById(facultyid);
		}
		
		
          @PostMapping("/post")
   		public FacultyDto save(@RequestBody FacultyDto request ) {
        	
      		

      			FacultyEntity faculty = new FacultyEntity();
      			faculty.setFirstName(request.getFirstName());
      			faculty.setLastName(request.getLastName());
      			faculty.setDateOfBirth(request.getDateOfBirth());
      			faculty.setGender(request.getGender());
      			faculty.setTitle(request.getTitle());
      			faculty.setStreet(request.getStreet());
      			faculty.setDesignation(request.getDesignation());
      			faculty.setEmail(request.getEmail());
      			faculty.setExperience(request.getExperience());
      			faculty.setPhoneNo(request.getPhoneNo());
      			faculty.setEmergencyPhoneNumber(request.getEmergencyPhoneNumber());
      			faculty.setPostalCode(request.getPostalCode());
      			//faculty.setCreatedBy("Admin");
      			faculty.setStatus(Status.ACTIVE);
      			
      			CountryEntity country=new CountryEntity();
         		country.setId(request.getCountry_id());
         		country.setCountryName(request.getCountryName());
         		country.setCountryshortName(request.getCountryshortName());
         		country.setStatus(Status.ACTIVE);
         		faculty.setCountryObj(country);
         		
         		StateEntity state=new StateEntity();
    			state.setId(request.getState_id());
    			state.setStateName(request.getStateName());
    			state.setStateshortName(request.getStateshortName());
    			state.setStatus(Status.ACTIVE);
    			state.setCountryObj(country);
    			faculty.setStateObj(state);
    			
    			
           			CityEntity city=new CityEntity();
        			city.setId(request.getCity_id());
        			city.setCityName(request.getCityName());
        			city.setCityshortName(request.getCityshortName());
        			city.setStatus(Status.ACTIVE);
                   	city.setStateObj(state);
        			faculty.setCityObj(city);
        			
             		DepartmentEntity department=new DepartmentEntity();
             		department.setId(request.getDepartment_id());
             		department.setDepartmentName(request.getDepartmentName());
             		department.setDepartmentshortName(request.getDepartmentshortName());
             		department.setStatus(Status.ACTIVE);
        			faculty.setDepartmentObj(department);
        			
        			
        			
        			
        			  UserLogin user = new UserLogin();
//            		if (request.getUserId() != null) {
           			//Optional<UserLogin> userOptional = facultyService.findById(request.getUserId());
//            		
            		   // user = userOptional.get();
            			user.setUserName(request.getUserName());
            			user.setPassword(PasswordUtil.getEncryptedPassword(request.getPassword())); 		
            			user.setPhoneNo(request.getPhoneNo());
            			user.setEmail(request.getEmail());
            			user.setStatus(Status.ACTIVE);
            			user.setUserType(request.getUserType());
            			
            			StandardEntity stdobj=new StandardEntity();
            			stdobj.setId(request.getStdId());
            				facultyService.save(user,faculty);
      			
    			return request;
    			  
          	
    }
          
          
          @PutMapping("/update")
          public ResponseEntity<String> update(@RequestBody FacultyDto request) {
        	 
        	  

    			FacultyEntity faculty = new FacultyEntity();
    			faculty.setFacultyId(request.getFacultyId());
    			faculty.setFirstName(request.getFirstName());
    			faculty.setLastName(request.getLastName());
    			faculty.setDateOfBirth(request.getDateOfBirth());
    			faculty.setGender(request.getGender());
    			faculty.setTitle(request.getTitle());
    			faculty.setStreet(request.getStreet());
    			faculty.setDesignation(request.getDesignation());
    			faculty.setEmail(request.getEmail());
    			faculty.setExperience(request.getExperience());
    			faculty.setPhoneNo(request.getPhoneNo());
    			faculty.setEmergencyPhoneNumber(request.getEmergencyPhoneNumber());
    			faculty.setPostalCode(request.getPostalCode());
    			faculty.setStatus(Status.ACTIVE);
    			
    			CountryEntity country=new CountryEntity();
       		country.setId(request.getCountry_id());
       		country.setCountryName(request.getCountryName());
       		country.setCountryshortName(request.getCountryshortName());
       		country.setStatus(Status.ACTIVE);
       		faculty.setCountryObj(country);
       		
       		StateEntity state=new StateEntity();
  			state.setId(request.getState_id());
  			state.setStateName(request.getStateName());
  			state.setStateshortName(request.getStateshortName());
  			state.setStatus(Status.ACTIVE);
  			state.setCountryObj(country);
  			faculty.setStateObj(state);
  			
  			
         			CityEntity city=new CityEntity();
      			city.setId(request.getCity_id());
      			city.setCityName(request.getCityName());
      			city.setCityshortName(request.getCityshortName());
      			city.setStatus(Status.ACTIVE);
                 	city.setStateObj(state);
      			faculty.setCityObj(city);
      			
           		DepartmentEntity department=new DepartmentEntity();
           		department.setId(request.getDepartment_id());
           		department.setDepartmentName(request.getDepartmentName());
           		department.setDepartmentshortName(request.getDepartmentshortName());
           		department.setStatus(Status.ACTIVE);
      		
           	 UserLogin user = new UserLogin();
     			user.setUserName(request.getUserName());
     			user.setPassword(PasswordUtil.getEncryptedPassword(request.getPassword())); 		
     			user.setPhoneNo(request.getPhoneNo());
     			user.setEmail(request.getEmail());
     			user.setStatus(Status.ACTIVE);
     			user.setUserType(request.getUserType());
     			
     			StandardEntity stdobj=new StandardEntity();
     			stdobj.setId(request.getStdId());

        			faculty.setDepartmentObj(department);
        			facultyService.save(user,faculty);
                  return ResponseEntity.ok("Faculty updated successfully.");
              
          }
          
          
          
          @DeleteMapping("/delete/{facultyId}")
          public void delete(@PathVariable("facultyId") UUID facultyId) {
              facultyService.delete(facultyId);
          }
          
          
      
          }
          
             
  