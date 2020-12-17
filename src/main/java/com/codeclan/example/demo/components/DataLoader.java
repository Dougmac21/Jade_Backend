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

//        PLAYERS

        Player jenken = new Player("Jenken", "A");
        playerRepository.save(jenken);

        Player amy = new Player("Amy", "A");
        playerRepository.save(amy);

        Player doug = new Player("Doug", "A");
        playerRepository.save(doug);

        Player emmi = new Player("Emmi", "A");
        playerRepository.save(emmi);

        Player malcolm = new Player("Malcolm", "A");
        playerRepository.save(malcolm);

        Player chris = new Player("Chris", "A");
        playerRepository.save(chris);

        Player eugene = new Player("Eugene", "A");
        playerRepository.save(eugene);

        Player harrison = new Player("Harrison", "A");
        playerRepository.save(harrison);

        Player dave = new Player("Dave", "A");
        playerRepository.save(dave);

        Player cat = new Player("Cat", "A");
        playerRepository.save(cat);

        Player maria = new Player("Maria", "A");
        playerRepository.save(maria);

        Player yana = new Player("Yana", "A");
        playerRepository.save(yana);

        Player paul = new Player("Paul", "A");
        playerRepository.save(paul);

        Player andrew = new Player("Andrew", "A");
        playerRepository.save(andrew);

        Player ann = new Player("Ann", "A");
        playerRepository.save(ann);

        Player mattH = new Player("Matt H", "A");
        playerRepository.save(mattH);

        Player mattT = new Player("Matt T", "A");
        playerRepository.save(mattT);

        Player mattM = new Player("Matt M", "A");
        playerRepository.save(mattM);

        Player iain = new Player("Iain", "A");
        playerRepository.save(iain);

        Player alan = new Player("Alan", "A");
        playerRepository.save(alan);

        Player steven = new Player("Steven", "A");
        playerRepository.save(steven);






//        GAMES


        Game snake = new Game("Snake");
        gameRepository.save(snake);

        Game spaceInvaders = new Game("Space Invaders");
        gameRepository.save(spaceInvaders);

        Game PRS = new Game("PRS");
        gameRepository.save(PRS);

        Game breakout = new Game("Breakout");
        gameRepository.save(breakout);

        Game frogger = new Game("Frogger");
        gameRepository.save(frogger);

        Game pacman = new Game("Pacman");
        gameRepository.save(pacman);


//        SCORES - snake

        Score snake1 = new Score(snake, emmi, 104, "2020-12-10");
        scoreRepository.save(snake1);

        Score snake2 = new Score(snake, andrew, 10, "2020-12-10");
        scoreRepository.save(snake2);

        Score snake3 = new Score(snake, iain, 8, "2020-12-09");
        scoreRepository.save(snake3);

        Score snake4 = new Score(snake, maria, 4, "2020-12-09");
        scoreRepository.save(snake4);

        Score snake5 = new Score(snake, alan, 23, "2020-12-08");
        scoreRepository.save(snake5);


//        SCORES - PRS

        Score prs1 = new Score(PRS, jenken, 87, "2020-12-09");
        scoreRepository.save(prs1);

        Score prs2 = new Score(PRS, ann, 80, "2020-12-09");
        scoreRepository.save(prs2);

        Score prs3 = new Score(PRS, mattM, 51, "2020-12-10");
        scoreRepository.save(prs3);

        Score prs4 = new Score(PRS, yana, 49, "2020-12-02");
        scoreRepository.save(prs4);

        Score prs5 = new Score(PRS, harrison, 999, "2020-12-14");
        scoreRepository.save(prs5);


//        SCORES - breakout

        Score breakout1 = new Score(breakout, doug, 310, "2020-12-14");
        scoreRepository.save(breakout1);

        Score breakout2 = new Score(breakout, cat, 12, "2020-12-14");
        scoreRepository.save(breakout2);

        Score breakout3 = new Score(breakout, eugene, 11, "2020-12-14");
        scoreRepository.save(breakout3);

        Score breakout4 = new Score(breakout, paul, 10, "2020-12-14");
        scoreRepository.save(breakout4);

        Score breakout5 = new Score(breakout, mattH, 9, "2020-12-14");
        scoreRepository.save(breakout5);


//        SCORES - pacman

        Score pacman1 = new Score(pacman, amy, 886, "2020-12-15");
        scoreRepository.save(pacman1);

        Score pacman2 = new Score(pacman, mattT, 610, "2020-12-15");
        scoreRepository.save(pacman2);

        Score pacman3 = new Score(pacman, chris, 588, "2020-12-15");
        scoreRepository.save(pacman3);

        Score pacman4 = new Score(pacman, dave, 577, "2020-12-15");
        scoreRepository.save(pacman4);

        Score pacman5 = new Score(pacman, iain, 542, "2020-12-15");
        scoreRepository.save(pacman5);

//          SCORES - spaceInvaders

        Score space1 = new Score(spaceInvaders, malcolm, 99, "2020-12-15");
        scoreRepository.save(space1);

        Score space2 = new Score(spaceInvaders, dave, 76, "2020-12-15");
        scoreRepository.save(space2);

        Score space3 = new Score(spaceInvaders, yana, 74, "2020-12-15");
        scoreRepository.save(space3);

        Score space4 = new Score(spaceInvaders, maria, 86, "2020-12-15");
        scoreRepository.save(space4);

        Score space5 = new Score(spaceInvaders, mattM, 86, "2020-12-15");
        scoreRepository.save(space5);

//        SCORES - frogger


        Score frogger1 = new Score(frogger, paul, 86, "2020-12-15");
        scoreRepository.save(frogger1);

        Score frogger2 = new Score(frogger, emmi, 86, "2020-12-15");
        scoreRepository.save(frogger2);

        Score frogger3 = new Score(frogger, doug, 85, "2020-12-15");
        scoreRepository.save(frogger3);

        Score frogger4 = new Score(frogger, malcolm, 81, "2020-12-15");
        scoreRepository.save(frogger4);

        Score frogger5 = new Score(frogger, dave, 80, "2020-12-15");
        scoreRepository.save(frogger5);

    }

}
