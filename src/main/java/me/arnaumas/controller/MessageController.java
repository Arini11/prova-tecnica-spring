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

import me.arnaumas.dto.Messages;
import me.arnaumas.service.MessageServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api")
public class MessageController {

	@Autowired
	MessageServiceImpl messageServiceImpl;
	
	@GetMapping("/messages")
	public List<Messages> getAll(){
		return messageServiceImpl.getAll();
	}
	
	@PostMapping("/messages")
	public Messages save(@RequestBody Messages p) {
		return messageServiceImpl.save(p);
	}
	
	@GetMapping("/messages/{id}")
	public Messages getBy(@PathVariable(name="id") Integer id) {
		Messages u = new Messages();
		u=messageServiceImpl.getById(id);
				
		return u;
	}
	
	@PutMapping("/messages/{id}")
	public Messages update(@PathVariable(name="id")Integer id,@RequestBody Messages message) {
		
		Messages u_seleccionado= new Messages();
		Messages u_actualizado= new Messages();
		
		u_seleccionado= messageServiceImpl.getById(id);
		
		u_seleccionado.setMessage(message.getMessage());
		u_seleccionado.setDate(message.getDate());		
		
		u_actualizado = messageServiceImpl.save(u_seleccionado);
				
		return u_actualizado;
	}
	
	@DeleteMapping("/messages/{id}")
	public void delete(@PathVariable(name="id")Integer id) {
		messageServiceImpl.delete(id);
	}
}
