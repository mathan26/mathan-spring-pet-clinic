package com.github.mathan26.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;

}
