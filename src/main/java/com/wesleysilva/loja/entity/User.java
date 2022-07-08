package com.wesleysilva.loja.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(length = 60)
    private String password;
    private String role;
    private boolean enabled = false;




    public User() {
    }

    public String getId() {
        return id;
    }

    public User(String id) {
        this.id = id;
    }


}
