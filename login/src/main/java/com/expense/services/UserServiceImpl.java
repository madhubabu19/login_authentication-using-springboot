package com.expense.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.entities.User;
import com.expense.repositories.UserRepository;

import jakarta.transaction.Transactional;
	@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean registeruser(User user) {
		
		try
		{
		userRepository.save(user);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public User loginuser(String name,String password)
	{
	
		User validuser = userRepository.findByName(name);
		if(validuser != null  && validuser.getPassword().equals(password))
		{
			return validuser;
		}
		return null;
	}

}
