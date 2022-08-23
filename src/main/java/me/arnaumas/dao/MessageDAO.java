package me.arnaumas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.dto.Messages;

public interface MessageDAO extends JpaRepository<Messages, Integer>{

}
