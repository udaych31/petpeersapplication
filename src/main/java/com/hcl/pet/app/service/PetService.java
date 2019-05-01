package com.hcl.pet.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hcl.pet.app.dto.MyPetsResponse;
import com.hcl.pet.app.dto.PetBuyRequest;
import com.hcl.pet.app.dto.PetBuyResponse;
import com.hcl.pet.app.entity.Pet;


public interface PetService {

	public PetBuyResponse buyPet(PetBuyRequest request);
	
	
	public MyPetsResponse myPets(Long userId);
	

	public ResponseEntity<List<Pet>> listOfPet();

	public ResponseEntity addPet(Pet pet);

	public ResponseEntity addPetTwo(Pet pet);
}
