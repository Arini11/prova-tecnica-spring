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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.arnaumas.dto.Users;
import me.arnaumas.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@GetMapping("/users")
	public List<Users> getAll(){
		return userServiceImpl.getUsers();
	}
	
	@PostMapping("/users")
	public Users save(@RequestBody Users user) {
		return userServiceImpl.saveUser(user);
	}
	
	@GetMapping("/users/{username}")
	public Users getBy(@PathVariable(name="username") String username) {
		Users u = new Users();
		u=userServiceImpl.getByUsername(username);
				
		return u;
	}
	
	@PutMapping("/users/{username}")
	public Users update(@PathVariable(name="username")String username,@RequestBody Users user) {
		
		Users u_seleccionado= new Users();
		Users u_actualizado= new Users();
		
		u_seleccionado= userServiceImpl.getByUsername(username);
		
		u_seleccionado.setUsername(user.getUsername());
		u_seleccionado.setEmail(user.getEmail());
		u_seleccionado.setSteamUserName(user.getSteamUserName());
		
		
		u_actualizado = userServiceImpl.saveUser(u_seleccionado);
				
		return u_actualizado;
	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable(name="id")Integer id) {
		userServiceImpl.deleteUser(id);
	}

}
