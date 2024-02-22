package br.com.jongs.draenceapi.model;

import java.util.List;
import java.util.UUID;

import br.com.jongs.draenceapi.model.playerAbility.Attacking;
import br.com.jongs.draenceapi.model.playerAbility.Defending;
import br.com.jongs.draenceapi.model.playerAbility.Dribbling;
import br.com.jongs.draenceapi.model.playerAbility.Goalkeeping;
import br.com.jongs.draenceapi.model.playerAbility.Passing;
import br.com.jongs.draenceapi.model.playerAbility.Physicality;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ElementCollection
    List<Attacking> attacking;
    @ElementCollection
    List<Dribbling> dribbling;
    @ElementCollection
    List<Defending> defeding;
    @ElementCollection
    List<Passing> passing;
    @ElementCollection
    List<Physicality> physicality;
    @ElementCollection
    List<Goalkeeping> goalkeeping;
}
