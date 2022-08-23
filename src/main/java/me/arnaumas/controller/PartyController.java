package me.arnaumas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.arnaumas.dto.Parties;
import me.arnaumas.service.PartyServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api")
public class PartyController {
	
	@Autowired
	PartyServiceImpl partyServiceImpl;
	
	@GetMapping("/parties")
	public List<Parties> getAll(){
		return partyServiceImpl.getAll();
	}
	
	@PostMapping("/parties")
	public Parties save(@RequestBody Parties p) {
		return partyServiceImpl.save(p);
	}
	
	@GetMapping("/parties/{id}")
	public Parties getBy(@PathVariable(name="id") Integer id) {
		Parties u = new Parties();
		u=partyServiceImpl.getById(id);
				
		return u;
	}
	
	@PutMapping("/parties/{id}")
	public Parties update(@PathVariable(name="id")Integer id,@RequestBody Parties party) {
		
		Parties u_seleccionado= new Parties();
		Parties u_actualizado= new Parties();
		
		u_seleccionado= partyServiceImpl.getById(id);
		
		u_seleccionado.setName(party.getName());
		u_seleccionado.setDescription(party.getDescription());		
		
		u_actualizado = partyServiceImpl.save(u_seleccionado);
				
		return u_actualizado;
	}
	
	@DeleteMapping("/parties/{id}")
	public void delete(@PathVariable(name="id")Integer id) {
		partyServiceImpl.delete(id);
	}


}
