package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

//    (Find games by name)
    List<Game> findByNameIgnoreCase(String gameName);


}
