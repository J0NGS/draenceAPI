package com.jongs.br.draenceapi.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import jakarta.validation.constraints.Size;
import java.util.UUID;
@Entity
@Table(name = "player")
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "player_id")
    @NotEmpty
    private UUID playerId;
    @NotEmpty
    private Float height;
    @NotEmpty
    private Float weight;
    @NotEmpty
    private String name;
    @NotEmpty 
    private String nationality;
    private String club;
    private String league;
    @Size(min = 30, max = 40)
    private Integer overral;
    @Size(min = 15, max = 50)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private String strongFoot;
    @Enumerated(EnumType.STRING)
    private String position;
    @NotEmpty
    @OneToOne(targetEntity = PlayerAttributes.class ,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PlayerAttributes attributes;
}
