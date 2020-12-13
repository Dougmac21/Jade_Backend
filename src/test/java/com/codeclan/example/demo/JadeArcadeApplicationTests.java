package com.codeclan.example.demo;

import com.codeclan.example.demo.models.Game;
import com.codeclan.example.demo.models.Player;
import com.codeclan.example.demo.models.Score;
import com.codeclan.example.demo.repositories.GameRepository;
import com.codeclan.example.demo.repositories.PlayerRepository;
import com.codeclan.example.demo.repositories.ScoreRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class JadeArcadeApplicationTests {

	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	GameRepository gameRepository;

	@Autowired
	ScoreRepository scoreRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreatePlayerGameAndScoreThenSave(){

		Player testPlayer = new Player("Mister TestPlayer", "A");
		Game testGame = new Game("The Test Game");
		Score testScore = new Score(testGame, testPlayer, 1000, "2020-12-01");
		playerRepository.save(testPlayer);
		gameRepository.save(testGame);
		scoreRepository.save(testScore);

		List<Player> foundPlayers = playerRepository.findByNameIgnoreCase("mister testplayer");
		assertEquals("Mister TestPlayer", foundPlayers.get(0).getName());
		assertEquals("A", foundPlayers.get(0).getPassword());

		List<Game> foundGames = gameRepository.findByNameIgnoreCase("the test game");
		assertEquals("The Test Game", foundGames.get(0).getName());

		List<Score> foundScores = scoreRepository.findByPlayerNameIgnoreCaseAndGameNameIgnoreCase("mister testplayer", "the test game");
		assertEquals("1000", foundScores.get(0).getScore().toString());

	}


}
