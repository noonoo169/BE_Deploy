package com.example.thetelephoneappbe.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "room")

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_room")
    private Long id;
    @Column(name = "status")
    private String status;
    @Column(name ="maxPlayer")
    private int maxPlayer = 4;
    @Column(name = "last_time_play")
    private LocalDateTime lastPlay;

    public int getMaxPlayer() {
        return maxPlayer;
    }

    public void setMaxPlayer(int maxPlayer) {
        this.maxPlayer = maxPlayer;
    }

    public LocalDateTime getLastPlay() {
        return lastPlay;
    }

    public void setLastPlay(LocalDateTime lastPlay) {
        this.lastPlay = lastPlay;
    }

    public Room(){
    }

    public Room(String status){
        this.status = status;
    }

    @OneToMany(mappedBy = "room")
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "room1")
    private List<Result> results = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id +
                ", status = " + status +
                ", maxPlayer =" + maxPlayer +
                ", users = " + users +
                ", results = " + results +
                '}';
    }
    
}


