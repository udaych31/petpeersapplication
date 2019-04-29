package com.hcl.pet.app.service;

import com.hcl.pet.app.dto.MyPetsResponse;
import com.hcl.pet.app.dto.PetBuyRequest;
import com.hcl.pet.app.dto.PetBuyResponse;

public interface PetService {

	public PetBuyResponse buyPet(PetBuyRequest request);
	
	
	public MyPetsResponse myPets(Long userId);
	
}
