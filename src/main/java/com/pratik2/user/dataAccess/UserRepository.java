package com.pratik2.user.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik2.user.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

}
