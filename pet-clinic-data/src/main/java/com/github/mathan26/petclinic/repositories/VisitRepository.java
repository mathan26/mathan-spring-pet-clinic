package com.github.mathan26.petclinic.repositories;

import com.github.mathan26.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
