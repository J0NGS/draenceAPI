package br.com.jongs.draenceapi.model.player;

import java.util.List;
import java.util.UUID;

import br.com.jongs.draenceapi.model.Contract;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column(unique = true)
    private String playerId;
    
    private String name;
    private String country;
    private String position;
    private String team;
    private String league;
    private Integer age;
    private Integer over;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Ability abilitys;
}
