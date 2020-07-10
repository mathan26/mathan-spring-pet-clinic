package com.github.mathan26.petclinic.repositories;

import com.github.mathan26.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository  extends CrudRepository<Vet, Long>
{
}
