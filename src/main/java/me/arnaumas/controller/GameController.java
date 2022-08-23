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

import me.arnaumas.dto.Games;
import me.arnaumas.service.GameServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api")
public class GameController {
	
	@Autowired
	GameServiceImpl gameServiceImpl;
	
	@GetMapping("/games")
	public List<Games> getAll(){
		return gameServiceImpl.getAll();
	}
	
	@PostMapping("/games")
	public Games save(@RequestBody Games p) {
		return gameServiceImpl.save(p);
	}
	
	@GetMapping("/games/{id}")
	public Games getBy(@PathVariable(name="id") Integer id) {
		Games u = new Games();
		u=gameServiceImpl.getById(id);
				
		return u;
	}
	
	@PutMapping("/games/{id}")
	public Games update(@PathVariable(name="id")Integer id,@RequestBody Games game) {
		
		Games u_seleccionado= new Games();
		Games u_actualizado= new Games();
		
		u_seleccionado= gameServiceImpl.getById(id);
		
		u_seleccionado.setTitle(game.getTitle());
		u_seleccionado.setThumbnailUrl(game.getThumbnailUrl());
		u_seleccionado.setUrl(game.getUrl());
		
		u_actualizado = gameServiceImpl.save(u_seleccionado);
				
		return u_actualizado;
	}
	
	@DeleteMapping("/games/{id}")
	public void delete(@PathVariable(name="id")Integer id) {
		gameServiceImpl.delete(id);
	}

}
