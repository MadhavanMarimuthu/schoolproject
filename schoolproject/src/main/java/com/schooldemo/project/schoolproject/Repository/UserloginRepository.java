package com.schooldemo.project.schoolproject.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooldemo.project.schoolproject.Entity.UserLogin;

public interface UserloginRepository extends JpaRepository<UserLogin, UUID> {

}
