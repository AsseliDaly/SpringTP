package org.openjfx.foyer.Entities;


import jakarta.persistence.*;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private Typechambre typeC;

}
