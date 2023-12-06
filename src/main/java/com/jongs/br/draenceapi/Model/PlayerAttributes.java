package com.jongs.br.draenceapi.Model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "player_attributes")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class PlayerAttributes {
    @Id
    @Column(name = "attributes_id")
    @NotEmpty
    private UUID attributesID;

    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer offensiveAwareness;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer ballControl;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer dribbling;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer tighPossession;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer lowPass;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer loftedPass;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer finishing;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer kickPower;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer balance;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer heading;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer jump;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer defensiveAwareness;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer ballWinning;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer aggression;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer placeKicking;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer curl;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer speed;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer acceleration;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer physicalContact;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer stamina;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer gkAwareness;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer gkCatching;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer gkClearing;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer gkReflexes;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer gkReach;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer weakFootAccuracy;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer weakFootUsage;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer form;
    @Size(max = 99, min = 40)
    @NotEmpty
    private Integer injuryResistance;
    @Enumerated(EnumType.STRING)
    private String playingStyle;
    private List<String> skills;
}
