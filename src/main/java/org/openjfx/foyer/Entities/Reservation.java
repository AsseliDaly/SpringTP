package org.openjfx.foyer.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idReservation;

    private Date aneeReservation;
    private boolean estvalide;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "reservations")
    private Set<Etudiant> etudiants;



}
