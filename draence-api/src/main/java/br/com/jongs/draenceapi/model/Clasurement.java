package br.com.jongs.draenceapi.model;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

//To use the @Data annotation you should add the Lombok dependency.
@Data
@Entity
public class Clasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String trigger;
    private String name;
    private double value;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date beginning;
    @Temporal(TemporalType.DATE)
    private Date ending;
}
