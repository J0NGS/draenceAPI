package br.com.jongs.draenceapi.model.player.playerAbility;


import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Attacking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer offensiveAwareness;
    private Integer finishing;
    private Integer kickingPower;
    private Integer weakFootUsage;
    private Integer weakFootAccuracy;
}
