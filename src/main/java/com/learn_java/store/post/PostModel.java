package com.learn_java.store.post;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;
    private String username;
    private String post;

    public PostModel(Integer id,String username,String post){
        this.id = id;
        this.username = username;
        this.post = post;
    }
}
