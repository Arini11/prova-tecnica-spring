package me.arnaumas.service;

import me.arnaumas.dto.GroupMembership;

public interface IGroupMembershipService {
	public GroupMembership joinGroup(GroupMembership joinGroup);
	public void leaveGroup(Integer id);
}
