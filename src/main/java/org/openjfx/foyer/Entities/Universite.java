package org.openjfx.foyer.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUniversite;
    private String nomUniversite;
    private String adresse;
}
