package com.target.services;

import com.target.model.CabPolicyRequestDTO;
import com.target.model.DropPointsRequestDTO;
import com.target.model.RegisterRequestDTO;
import com.target.model.RoutePlaneResponseDTO;

public interface ICabService {
	
	void createDropPoint(DropPointsRequestDTO DropPointsRequestDTO);

    void registerCabForTeamMember(RegisterRequestDTO registerRequestDTO);

    void createCabs(CabPolicyRequestDTO cabPolicyRequestDTO);
    
    RoutePlaneResponseDTO  generateRoutePlanFromHeadQuater();
    

}
