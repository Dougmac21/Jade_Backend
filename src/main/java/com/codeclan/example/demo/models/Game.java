package com.codeclan.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "total_play_time")
    private Integer total_play_time;

//    @ManyToMany
//    @JsonIgnoreProperties({"games"})
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            name = "games_players",
//            joinColumns = {@JoinColumn(name = "game_id", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "player_id", nullable = false, updatable = false)}
//    )
//    private List<Player> players;

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = "games")
    private List<Score> scores;

    public Game(String name) {
        this.name = name;
        this.total_play_time = 0;
//        this.players = new ArrayList<>();
        this.scores = new ArrayList<>();
    }

    public Game(){}

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

    public Integer getTotal_play_time() {
        return total_play_time;
    }

    public void setTotal_play_time(Integer total_play_time) {
        this.total_play_time = total_play_time;
    }

//    public List<Player> getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(List<Player> players) {
//        this.players = players;
//    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}