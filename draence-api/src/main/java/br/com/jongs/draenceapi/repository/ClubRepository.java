package br.com.jongs.draenceapi.repository;

import br.com.jongs.draenceapi.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClubRepository extends JpaRepository<Club, UUID> {
    boolean existsByClubId(String clubId);
}