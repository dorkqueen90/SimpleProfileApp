package com.example.profilecreator;

import java.io.Serializable;

public class Profile implements Serializable {
    String name;
    String email;
    String dep;
    String color;

    public Profile(String name, String email, String dep, String color) {
        this.name = name;
        this.email = email;
        this.dep = dep;
        this.color = color;
    }

}
