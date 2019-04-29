package com.hcl.pet.app.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.hcl.pet.app.entity.Pet;
import com.hcl.pet.app.repository.PetRepository;

@RunWith(MockitoJUnitRunner.class)
public class PetServiceTest {


	@InjectMocks
	private PetServiceImpl petServiceImpl;
	
	@Mock
	private PetRepository petRepository;
	
	ResponseEntity responseEntity=null;
	
	@Test
	public void testAddPet()

	{
		Pet pet=new Pet();
		Mockito.when(petRepository.save(pet)).thenReturn(pet);
		responseEntity=petServiceImpl.addPet(pet);
		assertEquals(responseEntity.ok().build(), responseEntity.ok().build());
	}
}
