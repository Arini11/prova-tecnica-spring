package me.arnaumas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.dao.PartiesDAO;
import me.arnaumas.dto.Parties;

@Service
public class PartyServiceImpl implements IPartyService {

	@Autowired
	PartiesDAO partiesDAO;

	@Override
	public List<Parties> getAll() {
		return partiesDAO.findAll();
	}

	@Override
	public Parties getById(Integer id) {
		return partiesDAO.findById(id).get();
	}

	@Override
	public Parties save(Parties party) {
		return partiesDAO.save(party);
	}

	@Override
	public Parties update(Parties party) {
		return partiesDAO.save(party);
	}

	@Override
	public void delete(Integer id) {
		partiesDAO.deleteById(id);
	}

}
