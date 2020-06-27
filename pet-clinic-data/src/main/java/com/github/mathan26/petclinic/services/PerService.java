package com.github.mathan26.petclinic.services;

import com.github.mathan26.petclinic.model.Pet;

import java.util.Set;

public interface PerService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();


}
