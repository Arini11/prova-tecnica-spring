package me.arnaumas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.dao.MessageDAO;
import me.arnaumas.dto.Messages;

@Service
public class MessageServiceImpl implements IMessageService {
	
	@Autowired
	MessageDAO messageDAO;

	@Override
	public List<Messages> getAll() {
		return messageDAO.findAll();
	}

	@Override
	public Messages getById(Integer id) {
		return messageDAO.findById(id).get();
	}

	@Override
	public Messages save(Messages message) {
		return messageDAO.save(message);
	}

	@Override
	public Messages update(Messages message) {
		return messageDAO.save(message);
	}

	@Override
	public void delete(Integer id) {
		messageDAO.deleteById(id);
		
	}

}
