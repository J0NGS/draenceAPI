package br.com.jongs.draenceapi.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PlayerTeamHistoric {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
}
