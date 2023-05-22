package com.Example.crud.operations;

import org.springframework.data.jpa.repository.JpaRepository; 

public interface UserRepository extends JpaRepository<User ,Integer>{
	User findById(int id);
	
}


