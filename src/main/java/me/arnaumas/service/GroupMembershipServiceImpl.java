package me.arnaumas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.dao.GroupMembershipDAO;
import me.arnaumas.dto.GroupMembership;

@Service
public class GroupMembershipServiceImpl implements IGroupMembershipService {
	
	@Autowired
	GroupMembershipDAO groupMembershipDAO;

	@Override
	public GroupMembership joinGroup(GroupMembership joinGroup) {
		return groupMembershipDAO.save(joinGroup);
	}

	@Override
	public void leaveGroup(Integer id) {
		groupMembershipDAO.deleteById(id);
		
	}

}
