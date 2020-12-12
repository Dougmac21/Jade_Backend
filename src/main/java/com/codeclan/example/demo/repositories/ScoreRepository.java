package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {

//    (Find scores by game name)
    List<Score> findByGameNameIgnoreCase(String gameName);

//    (Find scores by player name)
    List<Score> findByPlayerNameIgnoreCase(String playerName);

//    (Find scores by player name and game name)
    List<Score> findByPlayerNameIgnoreCaseAndGameNameIgnoreCase(String playerName, String gameName);


}
