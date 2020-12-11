package com.codeclan.example.demo.repositories;

import com.codeclan.example.demo.models.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
}
