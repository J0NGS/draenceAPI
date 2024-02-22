package br.com.jongs.draenceapi.model.playerAbility;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Defending {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int heading;
    private int jump;
    private int defensiveAwareness;
    private int ballWinning;
    private int aggression;
}
