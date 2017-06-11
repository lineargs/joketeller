package com.example;

import java.util.Random;

public class JokeTeller {

    private String[] jokes = {
            "What do you call a programmer from Finland? -Nerdic.",
            "What is a programmer's favourite hangout place? -Foo Bar",
            "Why did the programmer quit his job? -Because he didn't get arrays."
    };

    private Random random = new Random();

    public String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
