package com.hcl.pet.app.service;

import com.hcl.pet.app.dto.ResponseDTO;
import com.hcl.pet.app.dto.UserDTO;


public interface UserService {

	
	public boolean registerUser(UserDTO userdto);
	public ResponseDTO loginUser(String username,String password);
	public ResponseDTO loginUser1(String username,String password);


	
}
