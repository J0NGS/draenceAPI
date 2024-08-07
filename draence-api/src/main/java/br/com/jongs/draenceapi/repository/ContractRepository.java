package br.com.jongs.draenceapi.repository;

import br.com.jongs.draenceapi.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContractRepository extends JpaRepository<Contract, UUID> {
}