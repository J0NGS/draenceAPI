package br.com.jongs.draenceapi.controller;

import br.com.jongs.draenceapi.model.CreateClubRequest;
import br.com.jongs.draenceapi.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/draence/clubs")
public class ClubController {
    private ClubService service;

    @Autowired
    public ClubController(ClubService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> createClub (@RequestBody CreateClubRequest request){
        return service.createClub(request);
    }
}
