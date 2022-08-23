package me.arnaumas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.dao.GameDAO;
import me.arnaumas.dto.Games;

@Service
public class GameServiceImpl implements IGameService{
	
	@Autowired
	GameDAO gameDAO;

	@Override
	public List<Games> getAll() {
		return gameDAO.findAll();
	}

	@Override
	public Games getById(Integer id) {
		return gameDAO.findById(id).get();
	}

	@Override
	public Games save(Games game) {
		return gameDAO.save(game);
	}

	@Override
	public Games update(Games game) {
		return gameDAO.save(game);
	}

	@Override
	public void delete(Integer id) {
		gameDAO.deleteById(id);
		
	}

}
