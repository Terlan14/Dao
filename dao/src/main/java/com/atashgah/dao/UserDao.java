package com.atashgah.dao;

import java.util.List;

public interface UserDao {
	List<User>getAllUsers();
	User getUserById(int id);
	void saveUser(User user);
	void deleteUser(User user);
}
