package com.target.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.model.Cab;
import com.target.model.CabPolicyRequestDTO;
import com.target.model.DropPointsRequestDTO;
import com.target.model.RegisterRequestDTO;
import com.target.model.RoutePlaneResponseDTO;
import com.target.model.TeamMember;

@Service
public class CabServiceImpl implements ICabService{
	
	@Autowired
	CabRepository cabrepository;
	
	@Autowired
	TeamMemberRespository tmrepository;

	@Override
	public void createDropPoint(DropPointsRequestDTO dropPointsRequestDTO) {
		
		
		
	}

	@Override
	public void registerCabForTeamMember(RegisterRequestDTO registerRequestDTO) {
		List<TeamMember> tm=registerRequestDTO.getTeamMembers();
		    for (TeamMember teamMember : tm) {
			   tmrepository.save(teamMember);	
			}
		
	}

	@Override
	public void createCabs(CabPolicyRequestDTO cabPolicyRequestDTO) {
		List<Cab> cabs=cabPolicyRequestDTO.getCabs();
		for (Cab cab : cabs) {
			cabrepository.save(cab);
		}
		
	}

	@Override
	public RoutePlaneResponseDTO generateRoutePlanFromHeadQuater() {
		
		return null;
	}

}
