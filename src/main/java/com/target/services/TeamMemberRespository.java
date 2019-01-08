package com.target.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.target.model.TeamMember;

@Repository
public interface TeamMemberRespository extends CrudRepository<TeamMember, String> {

}
