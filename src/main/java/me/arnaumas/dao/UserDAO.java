package me.arnaumas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.dto.Users;

public interface UserDAO extends JpaRepository<Users, Integer>{
	public Users findByUsername(String username);
}
