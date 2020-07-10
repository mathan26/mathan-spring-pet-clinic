package com.github.mathan26.petclinic.repositories;

import com.github.mathan26.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
