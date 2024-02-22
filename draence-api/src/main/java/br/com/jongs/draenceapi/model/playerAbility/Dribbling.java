package br.com.jongs.draenceapi.model.playerAbility;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Dribbling {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int ballControl;
    private int dribbling;
    private int tightPossession;
    private int balance;
}
