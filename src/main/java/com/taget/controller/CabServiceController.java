package com.taget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.model.CabPolicyRequestDTO;
import com.target.model.RegisterRequestDTO;
import com.target.model.RoutePlaneResponseDTO;
import com.target.services.CabServiceImpl;

@RequestMapping("/")
@RestController
public class CabServiceController {
	
	@Autowired
	CabServiceImpl cabServiceImpl;
	
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("register")
	public ResponseEntity<?> registerUser(@RequestBody RegisterRequestDTO  registerRequestDTO ){
		cabServiceImpl.registerCabForTeamMember(registerRequestDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@PostMapping("cabs")
	public ResponseEntity<?> cabforUser(@RequestBody CabPolicyRequestDTO  cabPolicyRequestDTO ){
		cabServiceImpl.createCabs(cabPolicyRequestDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("route_plan")
	public ResponseEntity<?> getroutePlan(){
		RoutePlaneResponseDTO routePlanResponseDTO= new RoutePlaneResponseDTO();
		routePlanResponseDTO =	cabServiceImpl.generateRoutePlanFromHeadQuater();
		return new ResponseEntity<RoutePlaneResponseDTO>(routePlanResponseDTO,HttpStatus.OK);
		
	}
	
	

}
