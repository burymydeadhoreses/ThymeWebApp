package io.github.burymydeadhoreses.thymewebapp.models;

import lombok.Getter;

@Getter
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public User() {

    }
}
