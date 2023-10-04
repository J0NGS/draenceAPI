package com.jongs.br.draenceapi.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jongs.br.draenceapi.Model.Player;

public interface PlayerRepository extends JpaRepository<Player, UUID>{
    
}
