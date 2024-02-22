package br.com.jongs.draenceapi.model.playerAbility;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Physicality {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int speed;
    private int acceleration;
    private int physicalContact;
    private int stamina;
    private int form;
    private int injuryResistance;
}
