package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.LoggedInPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoggedInPlayerRepository extends JpaRepository<LoggedInPlayer, Long> {

    //    (Find logged in players by name)
    List<LoggedInPlayer> findByNameIgnoreCase(String loggedInPlayerName);


}
