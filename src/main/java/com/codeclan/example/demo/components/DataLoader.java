package com.codeclan.example.demo.components;

import com.codeclan.example.demo.models.Game;
import com.codeclan.example.demo.models.Player;
import com.codeclan.example.demo.models.Score;
import com.codeclan.example.demo.repositories.GameRepository;
import com.codeclan.example.demo.repositories.PlayerRepository;
import com.codeclan.example.demo.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    GameRepository gameRepository;

    @Autowired
    ScoreRepository scoreRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        Player playerOne = new Player("Player One");
        playerRepository.save(playerOne);

        Player playerTwo = new Player("Player Two");
        playerRepository.save(playerTwo);

        Player playerThree = new Player("Player Three");
        playerRepository.save(playerThree);

        Player playerFour = new Player("Player Four");
        playerRepository.save(playerFour);

        Game snake = new Game("Snake");
        gameRepository.save(snake);

        Game runner = new Game("Runner");
        gameRepository.save(runner);

        Game PRS = new Game("Paper, Rock, Scissors");
        gameRepository.save(PRS);

        Game breakout = new Game("Breakout");
        gameRepository.save(breakout);

        Score snakePlayerOne = new Score(snake, playerOne, 100, "2020-12-10");
        scoreRepository.save(snakePlayerOne);

        Score snakePlayerTwo = new Score(snake, playerTwo, 50, "2020-12-10");
        scoreRepository.save(snakePlayerTwo);

        Score runnerPlayerTwo = new Score(runner, playerTwo, 40, "2020-12-09");
        scoreRepository.save(runnerPlayerTwo);








    }

}
