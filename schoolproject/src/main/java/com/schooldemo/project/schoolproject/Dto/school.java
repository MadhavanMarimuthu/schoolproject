package com.schooldemo.project.schoolproject.Dto;

import java.util.UUID;

import com.schooldemo.project.schoolproject.Entity.CityEntity;
import com.schooldemo.project.schoolproject.Entity.CountryEntity;
import com.schooldemo.project.schoolproject.Entity.DepartmentEntity;
import com.schooldemo.project.schoolproject.Entity.StateEntity;

public class school {
	public static CountryEntity getCountry(UUID id) {
		CountryEntity c = new CountryEntity();
		c.setId(id);
		return c;
	}

	public static StateEntity getState(UUID id) {
		StateEntity s = new StateEntity();
		s.setId(id);
		return s;

	}

	public static CityEntity getCity(UUID id) {
		CityEntity c = new CityEntity();
		c.setId(id);
		return c;
	}

	
	public static DepartmentEntity getDepartment(UUID id) {
		DepartmentEntity s = new DepartmentEntity();
		s.setId(id);
		return s;
	}


}
