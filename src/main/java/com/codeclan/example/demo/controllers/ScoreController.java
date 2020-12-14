package com.codeclan.example.demo.controllers;

import com.codeclan.example.demo.models.Game;
import com.codeclan.example.demo.models.Player;
import com.codeclan.example.demo.models.Score;
import com.codeclan.example.demo.repositories.PlayerRepository;
import com.codeclan.example.demo.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;
import java.util.List;
import java.util.Optional;

@RestController
public class ScoreController {

    @Autowired
    ScoreRepository scoreRepository;

    @GetMapping(value = "/scores")
    public ResponseEntity<List<Score>> getAllScores(
            @RequestParam(value = "gamename", required = false) String gameName,
            @RequestParam(value = "playername", required = false) String playerName

    ) {
        if
        (gameName != null && playerName != null) {
            return new ResponseEntity<>(scoreRepository.findByPlayerNameIgnoreCaseAndGameNameIgnoreCase(playerName, gameName), HttpStatus.OK);
        }
        else if
        (gameName != null) {
            return new ResponseEntity<>(scoreRepository.findByGameNameIgnoreCase(gameName), HttpStatus.OK);
        }
        else if
        (playerName != null) {
            return new ResponseEntity<>(scoreRepository.findByPlayerNameIgnoreCase(playerName), HttpStatus.OK);



        } else
        return new ResponseEntity<>(scoreRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/scores/{id}")
    public ResponseEntity<Optional<Score>> getScoreById(@PathVariable Long id){
        return new ResponseEntity<>(scoreRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/scores")
    public ResponseEntity<Score> postScore(@RequestBody Score score){
        Score newScore = scoreRepository.save(score); // saves the return from the .save to the newScore variable
        return new ResponseEntity<>(newScore, HttpStatus.CREATED);
    }




}