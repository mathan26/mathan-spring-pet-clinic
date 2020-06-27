package com.github.mathan26.petclinic.services;

import com.github.mathan26.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
