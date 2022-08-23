package me.arnaumas.service;

import java.util.List;

import me.arnaumas.dto.Messages;


public interface IMessageService {
	public List<Messages> getAll(); //getAll
	public Messages getById(Integer id); //getBy
	public Messages save(Messages message); // save
	public Messages update(Messages message); // update
	public void delete(Integer id); // delete
}
