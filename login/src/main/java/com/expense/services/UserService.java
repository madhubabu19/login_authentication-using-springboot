package com.expense.services;

import com.expense.entities.User;

public interface UserService 
{
	public boolean registeruser(User user);
	public User loginuser(String name,String password);

}
