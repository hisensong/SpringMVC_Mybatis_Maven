package com.ssmm.service;

import com.ssmm.model.User;

public interface UserService {
	public User getUserById(int id);
	
	public void saveUser(User user);
	
	boolean addUser(User user);//测试事务
}
