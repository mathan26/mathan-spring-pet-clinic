package com.github.mathan26.petclinic.repositories;

import com.github.mathan26.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
