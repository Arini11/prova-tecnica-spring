package me.arnaumas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.dto.GroupMembership;

public interface GroupMembershipDAO extends JpaRepository<GroupMembership, Integer>{

}
