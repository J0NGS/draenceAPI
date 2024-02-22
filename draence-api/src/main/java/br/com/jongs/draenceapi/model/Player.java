package br.com.jongs.draenceapi.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String country;
    private String position;
    private String team;
    private String league;
    private Integer age;
    private Integer over;
    @OneToOne
    private Ability abilitys;
    @OneToOne
    private PlayerTeamHistoric teamHistoric;
}
