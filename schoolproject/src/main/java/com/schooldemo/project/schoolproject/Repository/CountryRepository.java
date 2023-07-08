package com.schooldemo.project.schoolproject.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schooldemo.project.schoolproject.Entity.CountryEntity;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, UUID>{

}
