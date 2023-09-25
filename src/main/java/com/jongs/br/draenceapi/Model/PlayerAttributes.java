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
    private PlayingStyle playingStyle;
    @Enumerated(EnumType.STRING)
    @Size(min = 0, max = 10)
    private List<PlayerSkills> skills; // 10 player skills
    
    public enum PlayingStyle{
        GOAL_POACHER,
        DUMMY_RUNNER,
        FOX_IN_THE_BOX,
        TARGET_MAN,
        CREATIVE_PLAYMAKER,
        PROLIFIC_WINGER,
        ROAMING_FLANK,
        CROSS_SPECIALIST,
        CLASSIC_N10,
        HOLE_PLAYER,
        BOX_TO_BOX,
        THE_DESTROYER,
        ORCHESTRATOR,
        ANCHOR_MAN,
        BUILD_UP,
        OFFENSIVE_FULLBACK,
        FULLBACK_FINISHER,
        DEFENSIVE_FULLBACK,
        EXTRA_FRONTMAN,
        OFFENSIVE_GK,
        DEFENSIVE_GK
    }

    public enum PlayerSkills{
        SCISSORS_FEINT,
        DOUBLE_TOCH,
        FLIPFLAP,
        MARSEILLE_TURN,
        SOMBRERO,
        CROSS_OVER_TURN,
        CUT_BEHIND_TURN,
        SCOTCH_MOVE,
        STEP_ON_SKILL_CONTROL,
        HEADING,
        LONG_RANGE_DRIVE,
        CLIP_SHOT_CONTROL,
        LONG_RANGE_SHOOTING,
        KNUCKLE_SHOT,
        DIPPING_SHOT,
        RISING_SHOT,
        ACROBATIC_FINISHING,
        HEEL_TRICK,
        FIRST_TIME_SHOT,
        ONE_TOUCH_PASS,
        THROUGH_PASSING,
        WEIGHTED_PASS,
        PINPOINT_CROSSING,
        OUTSIDE_CURLER,
        RABONA,
        NO_LOOK_PASS,
        LOW_LOFTED_PASS,
        GK_LOW_PUNT,
        GK_HIGH_PUNT,
        GK_LONG_THROW,
        PENALTY_SPECIALIST,
        GK_PENALTY_SAVER,
        GAMESMANSHIP,
        MAN_MARKING,
        TRACK_BACK,
        INTERCEPTION,
        ACROBATIC_CLEAR,
        CAPTAINCY,
        SUPER_SUB,
        FIGHTING_SPIRIT
    }
}
