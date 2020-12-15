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

        Player playerOne = new Player("Player One", "A");
        playerRepository.save(playerOne);

        Player playerTwo = new Player("Player Two", "A");
        playerRepository.save(playerTwo);

        Player playerThree = new Player("Player Three", "A");
        playerRepository.save(playerThree);

        Player playerFour = new Player("Player Four", "A");
        playerRepository.save(playerFour);

        Game snake = new Game("Snake");
        gameRepository.save(snake);

        Game runner = new Game("Runner");
        gameRepository.save(runner);

        Game PRS = new Game("PRS");
        gameRepository.save(PRS);

        Game breakout = new Game("Breakout");
        gameRepository.save(breakout);

        Game frogger = new Game("Frogger");
        gameRepository.save(frogger);

        Game shooter = new Game("Shooter");
        gameRepository.save(shooter);

        Score snakePlayerOne = new Score(snake, playerOne, 100, "2020-12-10");
        scoreRepository.save(snakePlayerOne);

        Score snakePlayerTwo = new Score(snake, playerTwo, 50, "2020-12-10");
        scoreRepository.save(snakePlayerTwo);

        Score runnerPlayerTwo = new Score(runner, playerTwo, 40, "2020-12-09");
        scoreRepository.save(runnerPlayerTwo);

        Score runnerPlayerThree = new Score(runner, playerThree, 30, "2020-12-09");
        scoreRepository.save(runnerPlayerThree);

        Score PRSPlayerThree = new Score(PRS, playerThree, 50, "2020-12-08");
        scoreRepository.save(PRSPlayerThree);

        Score PRSPlayerFour = new Score(PRS, playerFour, 40, "2020-12-09");
        scoreRepository.save(PRSPlayerFour);

        Score breakoutPlayerFour = new Score(breakout, playerFour, 80, "2020-12-09");
        scoreRepository.save(breakoutPlayerFour);

        Score breakoutPlayerOne = new Score(breakout, playerOne, 30, "2020-12-10");
        scoreRepository.save(breakoutPlayerOne);

        Score froggerPlayerOne = new Score(frogger, playerOne, 110, "2020-12-02");
        scoreRepository.save(froggerPlayerOne);

        Score froggerPlayerOne_2 = new Score(frogger, playerOne, 120, "2020-12-14");
        scoreRepository.save(froggerPlayerOne_2);

        Score froggerPlayerOne_3 = new Score(frogger, playerOne, 310, "2020-12-14");
        scoreRepository.save(froggerPlayerOne_3);

        Score froggerPlayerOne_4 = new Score(frogger, playerOne, 440, "2020-12-14");
        scoreRepository.save(froggerPlayerOne_4);

        Score froggerPlayerOne_5 = new Score(frogger, playerOne, 560, "2020-12-14");
        scoreRepository.save(froggerPlayerOne_5);

        Score froggerPlayerOne_6 = new Score(frogger, playerOne, 620, "2020-12-14");
        scoreRepository.save(froggerPlayerOne_6);

        Score froggerPlayerOne_7 = new Score(frogger, playerOne, 700, "2020-12-14");
        scoreRepository.save(froggerPlayerOne_7);

        Score shooterPlayerOne = new Score(shooter, playerOne, 86, "2020-12-15");
        scoreRepository.save(shooterPlayerOne);


    }

}
