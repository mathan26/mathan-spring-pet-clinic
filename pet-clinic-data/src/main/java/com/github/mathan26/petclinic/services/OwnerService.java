package com.github.mathan26.petclinic.services;

import com.github.mathan26.petclinic.model.Owner;

import javax.jws.Oneway;
import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
