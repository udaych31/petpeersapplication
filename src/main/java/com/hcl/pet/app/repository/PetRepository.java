package com.hcl.pet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.pet.app.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
