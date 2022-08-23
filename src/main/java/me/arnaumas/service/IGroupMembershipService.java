package me.arnaumas.service;

import java.util.List;

import me.arnaumas.dto.GroupMembership;

public interface IGroupMembershipService {
	public List<GroupMembership> getAll(); //getAll

	public GroupMembership joinGroup(GroupMembership joinGroup);
	public void leaveGroup(Integer id);
}
