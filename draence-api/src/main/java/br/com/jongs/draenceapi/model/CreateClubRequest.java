package br.com.jongs.draenceapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

/**
 * DTO for {@link Club}
 */
public record CreateClubRequest(
        @NotNull(message = "Club id it can not be null") @NotEmpty(message = "Club id it can not be empty") @NotBlank(message = "Club id it can not be blank") String clubId,
        @NotNull(message = "Club name it can not be null") @NotEmpty(message = "Club name it can not be empty") @NotBlank(message = "Club id it can not be blank") String name,
        @NotNull(message = "Club city it can not be null") @NotEmpty(message = "Club city it can not be empty") @NotBlank(message = "Club city it can not be empty") String city,
        @NotNull(message = "Club country it can not be null") @NotEmpty(message = "Club country it can not be empty") @NotBlank(message = "Club country it can not be blank") String country,
        String description, int yearFundation) implements Serializable {

    public Club RequestToClub (Club club){
        club.setClubId(clubId());
        club.setCity(city());
        club.setName(name());
        club.setCountry(country());
        club.setDescription(description());
        club.setYearFundation(yearFundation());

        return club;
    }
}
