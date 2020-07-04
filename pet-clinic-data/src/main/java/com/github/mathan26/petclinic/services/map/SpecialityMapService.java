package com.github.mathan26.petclinic.services.map;

import com.github.mathan26.petclinic.model.Speciality;
import com.github.mathan26.petclinic.services.SpecialtiesService;

import java.util.Set;

public class SpecialityMapService  extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
