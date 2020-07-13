package com.github.mathan26.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet  extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vets_specialities" ,joinColumns = @JoinColumn(name = "vet_id"),
        inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities =new HashSet<>();

}
