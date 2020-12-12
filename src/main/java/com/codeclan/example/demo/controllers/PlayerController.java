package com.codeclan.example.demo.controllers;

import com.codeclan.example.demo.models.Player;
import com.codeclan.example.demo.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping(value = "/players")
    public ResponseEntity<List<Player>> getAllPlayers(
            @RequestParam(value = "name", required = false) String playerName,
            @RequestParam(value = "gamename", required = false) String gameName

    ){
    if
    (playerName != null) {
        return new ResponseEntity<>(playerRepository.findByNameIgnoreCase(playerName), HttpStatus.OK);
    }
    else if
    (gameName != null) {
        return new ResponseEntity<>(playerRepository.findByGameNameIgnoreCase(gameName), HttpStatus.OK);
    }
        return new ResponseEntity<>(playerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/players/{id}")
    public ResponseEntity<Optional<Player>> getPlayerById(@PathVariable Long id) {
        return new ResponseEntity<>(playerRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/players")
    public ResponseEntity<Player> postPlayer(@RequestBody Player player){
        Player newPlayer = playerRepository.save(player); // saves the return from the .save to the newPlayer variable
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }


}