package br.com.jongs.draenceapi.model.player;

import java.util.List;
import java.util.UUID;

import br.com.jongs.draenceapi.model.player.playerAbility.Attacking;
import br.com.jongs.draenceapi.model.player.playerAbility.Defending;
import br.com.jongs.draenceapi.model.player.playerAbility.Dribbling;
import br.com.jongs.draenceapi.model.player.playerAbility.Goalkeeping;
import br.com.jongs.draenceapi.model.player.playerAbility.Passing;
import br.com.jongs.draenceapi.model.player.playerAbility.Physicality;
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
