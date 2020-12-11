package com.codeclan.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "arcade_play_time")
    private Integer arcade_play_time;

    @ManyToMany
    @JsonIgnoreProperties({"players"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "players_games",
            joinColumns = {@JoinColumn(name = "player_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "game_id", nullable = false, updatable = false)}
    )
    private List<Game> games;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = "players")
    private List<Score> scores;

    public Player(String name) {
        this.name = name;
        this.arcade_play_time = 0;
        this.games = new ArrayList<>();
        this.scores = new ArrayList<>();
    }

    public Player(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArcade_play_time() {
        return arcade_play_time;
    }

    public void setArcade_play_time(Integer arcade_play_time) {
        this.arcade_play_time = arcade_play_time;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}