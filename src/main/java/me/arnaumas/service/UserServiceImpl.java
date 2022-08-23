package me.arnaumas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.dao.UserDAO;
import me.arnaumas.dto.Users;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserDAO userDAO;

	@Override
	public List<Users> getUsers() {
		return userDAO.findAll();
	}

	@Override
	public Users getByUsername(String username) {
		return userDAO.findByUsername(username);
	}

	@Override
	public Users saveUser(Users user) {
		return userDAO.save(user);
	}

	@Override
	public Users updateUser(Users user) {
		return userDAO.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userDAO.deleteById(id);
	}

	@Override
	public List<Users> getFriends() {
		return userDAO.findAll();
	}

	@Override
	public Users addFriend(Users user) {
		return userDAO.save(user);
	}

	@Override
	public void deleteFriend(Integer id) {
		userDAO.deleteById(id);
	}

}
