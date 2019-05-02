package com.hcl.pet.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pet.app.dto.ResponseDTO;
import com.hcl.pet.app.dto.UserDTO;
import com.hcl.pet.app.entity.User;
import com.hcl.pet.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	
	ResponseDTO response=null;
	 
	@Override
	public boolean registerUser(UserDTO userdto) {
		
		User user=new User();
		
		if(userdto.getConfirmPassword().equals(userdto.getPassword())) {
       
			 user.setUserName(userdto.getUserName());
             user.setPassword(userdto.getPassword());
           
             userRepository.save(user);
             return true;
       
		}
        else {
        	
             return false;
        }      
		
	}
	
	@Override
	public boolean registerUser1(UserDTO userdto) {
		
		User user=new User();
		
		if(userdto.getConfirmPassword().equals(userdto.getPassword())) {
       
			 user.setUserName(userdto.getUserName());
             user.setPassword(userdto.getPassword());
           
             userRepository.save(user);
             return true;
       
		}
        else {
        	
             return false;
        }      
		
	}

	@Override
	public ResponseDTO loginUser(String username,String password) {
		
		List<User> users=userRepository.findAll();
		response=new ResponseDTO();
		  
		for(User user:users) {
			
			if(user.getUserName().equals(username) && user.getPassword().equals(password)) {
				
				response.setValue(true);
				
			}
			
			else {
				response.setValue(false);
			}
			
		}
			
		return response;
	}

}
