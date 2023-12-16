package com.atashgah.dao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{

	//list is working as database
	private List<User>users;
	
	public UserDaoImpl() {
		users=new ArrayList<>();
		users.add(new User(1,"terlan","123"));
		users.add(new User(2,"yusif","123"));
		users.add(new User(3,"veli","123"));
	}
	
	@Override
	public List<User> getAllUsers() {
		
		return users;
		
	}

	@Override
	public User getUserById(int id) {
		
		return users.get(id);
	}

	@Override
	public void saveUser(User user) {

		users.add(user);
	}

	@Override
	public void deleteUser(User user) {

		users.remove(user);
	}

}
