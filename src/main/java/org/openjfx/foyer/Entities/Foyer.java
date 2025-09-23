package org.openjfx.foyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Foyer {
    @Id
    @GeneratedValue
    private int idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
}
