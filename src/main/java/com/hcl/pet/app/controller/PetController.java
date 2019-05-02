package com.hcl.pet.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pet.app.dto.MyPetsResponse;
import com.hcl.pet.app.dto.PetBuyRequest;
import com.hcl.pet.app.dto.PetBuyResponse;
import com.hcl.pet.app.entity.Pet;
import com.hcl.pet.app.service.PetServiceImpl;

@RestController
@RequestMapping("pet")
public class PetController {

	
	@Autowired
	private PetServiceImpl petServiceImpl;
	
	
	@GetMapping("/findmypets")
	public MyPetsResponse findMyPets(@RequestParam("userId") Long userId) {
		return petServiceImpl.myPets(userId);
	}
	
	@PostMapping("/buypet")
	public PetBuyResponse buyPet(@RequestBody PetBuyRequest request) {
		return petServiceImpl.buyPet(request);
	}
	@GetMapping("/listofpets")
	public ResponseEntity<List<Pet>> listOfPets()
	{
		ResponseEntity<List<Pet>> petListResult=petServiceImpl.listOfPet();
		return petListResult;
		
	}
	@PostMapping("/addpet")
	public ResponseEntity listOfPets(@RequestBody Pet pet)
	{
		ResponseEntity response=petServiceImpl.addPet(pet);
		System.out.println("addpet");
		return response;
		
		
	}
	
	@GetMapping("/get")
	public String getmessage() {
		return "welcome to petpeers1";
	}
	
	
	@GetMapping("/msg")
	public String getmsg() {
		return "welcome to petpeers";
	}

	
	@GetMapping("/hi")
	public String sayHello(@RequestParam("name") String name) {
		return "welcome "+name;
	}
	
	@GetMapping("/say")
	public String sayHi(@RequestParam("uname") String uname) {
		return "welcome "+uname;
	}

	@GetMapping("/say1")
	public String sayHi1(@RequestParam("uname") String uname) {
		return "welcome 1"+uname;
	}

	@GetMapping("/sayhello")
	public String sayHihello(@RequestParam("uname") String uname) {
		return "welcome "+uname;
	}
	
	
	
}
