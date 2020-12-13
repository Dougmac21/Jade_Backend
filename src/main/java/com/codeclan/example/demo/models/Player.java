package com.codeclan.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @Column(name = "password")
    private String password;

    @Column(name = "arcade_play_time")
    private Integer arcade_play_time;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = "player")
    private List<Score> scores;

    public Player(String name, String password) {
        this.name = name;
        this.password = password;
        this.arcade_play_time = 0;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getArcade_play_time() {
        return arcade_play_time;
    }

    public void setArcade_play_time(Integer arcade_play_time) {
        this.arcade_play_time = arcade_play_time;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}