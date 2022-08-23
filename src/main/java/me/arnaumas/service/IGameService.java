package me.arnaumas.service;

import java.util.List;

import me.arnaumas.dto.Games;

public interface IGameService {
	public List<Games> getAll(); //getAll
	public Games getById(Integer id); //getBy
	public Games save(Games game); // save
	public Games update(Games game); // update
	public void delete(Integer id); // delete
}
