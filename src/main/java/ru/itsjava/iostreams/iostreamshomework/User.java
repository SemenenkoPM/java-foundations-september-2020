package ru.itsjava.iostreams.iostreamshomework;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Setter
@Getter
@ToString
public class User implements Serializable {

    private String login;
    private transient String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }


}
