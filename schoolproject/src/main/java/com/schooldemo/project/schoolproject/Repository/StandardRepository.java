package com.schooldemo.project.schoolproject.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schooldemo.project.schoolproject.Entity.StandardEntity;

@Repository
public interface StandardRepository extends CrudRepository<StandardEntity, UUID> {

}
