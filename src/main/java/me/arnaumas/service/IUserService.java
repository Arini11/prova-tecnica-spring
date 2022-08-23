package me.arnaumas.service;

import java.util.List;

import me.arnaumas.dto.Users;

public interface IUserService {
	public List<Users> getUsers(); //getAll
	public Users getByUsername(String username); //getBy
	public Users saveUser(Users user); // save
	public Users updateUser(Users user); // update
	public void deleteUser(Integer id); // delete
	
	public List<Users> getFriends();
	public Users addFriend(Users user);
	public void deleteFriend(Integer id);
}
