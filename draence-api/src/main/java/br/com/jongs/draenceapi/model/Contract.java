package br.com.jongs.draenceapi.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import br.com.jongs.draenceapi.model.player.Player;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;
    
    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    private Club club;
    
    private double salary;
    private double bonus;
    
    @Temporal(TemporalType.DATE)
    private Date beginning;
    
    @Temporal(TemporalType.DATE)
    private Date ending;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contract_id")
    private List<Clasurement> measurements;

    private boolean activated;
}
