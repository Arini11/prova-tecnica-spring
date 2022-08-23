package me.arnaumas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.arnaumas.dto.GroupMembership;
import me.arnaumas.dto.Parties;
import me.arnaumas.service.GroupMembershipServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api")
public class GroupMembershipController {
	@Autowired
	GroupMembershipServiceImpl groupMembershipServiceImpl;
	
	@GetMapping("/groupMemberships")
	public List<GroupMembership> getAll(){
		return groupMembershipServiceImpl.getAll();
	}
	@PostMapping("/groupMemberships")
	public GroupMembership joinGroup(@RequestBody GroupMembership groupMembership) {
		return groupMembershipServiceImpl.joinGroup(groupMembership);
	}
	@DeleteMapping("/groupMemberships/{id}")
	public void leaveGroup(@PathVariable(name="id")Integer id) {
		groupMembershipServiceImpl.leaveGroup(id);
	}
}
