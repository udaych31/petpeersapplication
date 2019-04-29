
package com.hcl.pet.app.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.pet.app.dto.ResponseDTO;
import com.hcl.pet.app.dto.UserDTO;
import com.hcl.pet.app.entity.User;
import com.hcl.pet.app.repository.UserRepository;




@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTests {
	
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl serviceImpl;
	
	
	static UserDTO userdto=null;
	User user=null;
	
	public static void setUP() {
		userdto=new UserDTO();		
	}
	
	//@Test
	public void testRegisterUser() {
		userdto=new UserDTO();
		
		userdto.setUserName("suma");
		userdto.setPassword("karna");
		userdto.setConfirmPassword("karna");
		boolean value=serviceImpl.registerUser(userdto);
		
		Mockito.when(userRepository.save(user)).thenReturn(user);
		
		Assert.assertEquals(true, value);
		
	}

	//@Test
	public void testLoginUser() {
		User user=new User();
		user.setUserName("suma");
		user.setPassword("karna");
		List<User> users=new ArrayList<>();
		users.add(user);
		
		Mockito.when(userRepository.findAll()).thenReturn(users);
		
		userdto=new UserDTO();
		userdto.setUserName("suma");
		userdto.setPassword("karna");
		ResponseDTO value=serviceImpl.loginUser(userdto.getUserName(), userdto.getPassword());
		
		Assert.assertEquals(true,value.isValue());
}
	
	
	
	
	

}
