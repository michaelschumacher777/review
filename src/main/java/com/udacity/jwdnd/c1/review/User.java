package com.udacity.jwdnd.c1.review;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    String username;
    String salt;
    String password;
    String firstName;
    String lastName;

    public User(String username, String salt, String password, String firstName, String lastName) {
        this.username = username;
        this.salt = salt;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
