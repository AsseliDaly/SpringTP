package org.openjfx.foyer.Entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Universite implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUniversite;

    private String nomUniversite;

    private String adresse;

    @OneToOne
    private Foyer foyer;

}
