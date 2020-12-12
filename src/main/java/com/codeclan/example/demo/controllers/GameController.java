package com.codeclan.example.demo.controllers;

import com.codeclan.example.demo.models.Game;
import com.codeclan.example.demo.models.Player;
import com.codeclan.example.demo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping(value = "/games")
    public ResponseEntity<List<Game>> getAllGames(
            @RequestParam(value = "name", required = false) String gameName,
            @RequestParam(value = "playername", required = false) String playerName

    ){
        if
        (gameName != null) {
            return new ResponseEntity<>(gameRepository.findByNameIgnoreCase(gameName), HttpStatus.OK);
        }
        if
        (playerName != null) {
            return new ResponseEntity<>(gameRepository.findByPlayerNameIgnoreCase(playerName), HttpStatus.OK);
        }
        return new ResponseEntity<>(gameRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/games/{id}")
    public ResponseEntity<Optional<Game>> getGameById(@PathVariable Long id){
        return new ResponseEntity<>(gameRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/games")
    public ResponseEntity<Game> postGame(@RequestBody Game game){
        Game newGame = gameRepository.save(game); // saves the return from the .save to the newGame variable
        return new ResponseEntity<>(newGame, HttpStatus.CREATED);
    }


}