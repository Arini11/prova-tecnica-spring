package me.arnaumas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.dto.Games;

public interface GameDAO extends JpaRepository<Games, Integer>{

}
