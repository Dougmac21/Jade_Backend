package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {

    List<Score> findByGameNameIgnoreCase(String gameName);
    List<Score> findByPlayerNameIgnoreCase(String playerName);
    List<Score> findByPlayerNameIgnoreCaseAndGameNameIgnoreCase(String playerName, String gameName);


}
