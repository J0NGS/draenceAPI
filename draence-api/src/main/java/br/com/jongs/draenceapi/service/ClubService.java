package br.com.jongs.draenceapi.service;

import br.com.jongs.draenceapi.model.Club;
import br.com.jongs.draenceapi.model.CreateClubRequest;
import br.com.jongs.draenceapi.repository.ClubRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ClubService
{
    private ClubRepository repository;

    @Autowired
    public ClubService(ClubRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public ResponseEntity<String> createClub(CreateClubRequest request){
        Club entity = new Club();

        entity = request.RequestToClub(entity);

        if (repository.existsByClubId(entity.getClubId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Club with club id already exists");
        }
        repository.save(entity);
        return new ResponseEntity<>("Club created!", HttpStatus.CREATED);
    }
}
