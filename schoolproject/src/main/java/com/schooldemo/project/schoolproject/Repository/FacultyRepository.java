package com.schooldemo.project.schoolproject.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schooldemo.project.schoolproject.Entity.FacultyEntity;

@Repository
public interface FacultyRepository extends CrudRepository<FacultyEntity, UUID> {






	

}
