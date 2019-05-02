package com.hcl.pet.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pet.app.dto.ResponseDTO;
import com.hcl.pet.app.dto.UserDTO;
import com.hcl.pet.app.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserDTO userdto){
		
		 boolean value=userService.registerUser(userdto);  
		   if(value) { 
			   	return new ResponseEntity<String>("RegisterUser Successfully",HttpStatus.CREATED);
		   }
		   else {
		    return new ResponseEntity<String>("Confirm password and password did not match",HttpStatus.CREATED);
		   }
		
		
	}
	
	
	@GetMapping("/login")
	public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password){
		
		
		 ResponseDTO response=userService.loginUser(username,password);  
		   if(response.isValue()) { 
			   	return new ResponseEntity<String>("Logged in Successfully",HttpStatus.CREATED);
		   }
		   else {
		    return new ResponseEntity<String>("passsword or username did not match",HttpStatus.CREATED);
		   }
		
		
		
	}
	
	
	@GetMapping("/hi")
	public String getMsg() {
		return "hello";
	}
	
	
	

}
