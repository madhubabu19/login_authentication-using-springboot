package com.expense.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> 
{
	
	// all CRUD operations will be imported as it extends JPA repository
	
	User  findByName(String name);
	

}
