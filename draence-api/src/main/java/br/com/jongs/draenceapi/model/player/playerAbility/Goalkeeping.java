package br.com.jongs.draenceapi.model.player.playerAbility;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Goalkeeping {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int GkAwareness;
    private int GkCatching;
    private int GkClearing;
    private int GkReflexes;
    private int GkReach;
}
