package org.openjfx.foyer.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Foyer implements Serializable {
    @Id
    @GeneratedValue
    private int idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToMany(mappedBy = "foyer")
    private List<Bloc> Blocs;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;
}
