package com.github.mathan26.petclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="visits")
public class Visit extends BaseEntity{
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
