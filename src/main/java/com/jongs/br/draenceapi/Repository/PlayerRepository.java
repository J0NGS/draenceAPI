package com.jongs.br.draenceapi.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jongs.br.draenceapi.Model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID>{
    
}