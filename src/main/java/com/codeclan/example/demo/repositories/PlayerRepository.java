package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

//    (Find players by name)
    List<Player> findByNameIgnoreCase(String playerName);


}
