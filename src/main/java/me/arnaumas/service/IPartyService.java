package me.arnaumas.service;

import java.util.List;
import java.util.Optional;

import me.arnaumas.dto.Parties;

public interface IPartyService {	
	public List<Parties> getAll(); //getAll
	public Parties getById(Integer id); //getBy
	public Parties save(Parties party); // save
	public Parties update(Parties party); // update
	public void delete(Integer id); // delete
}
