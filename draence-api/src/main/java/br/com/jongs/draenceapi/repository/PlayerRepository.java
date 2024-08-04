package br.com.jongs.draenceapi.repository;

import br.com.jongs.draenceapi.model.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {
}