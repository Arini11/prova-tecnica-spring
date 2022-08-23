package me.arnaumas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.dto.Parties;

public interface PartiesDAO extends JpaRepository<Parties, Integer>{
	public List<Parties> findByName(String name);
	public List<Parties> findByGames(String game);
}
