package org.openjfx.foyer.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private Typechambre typeC;
    @OneToMany
    private Set<Reservation> reservations;
    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;

}
