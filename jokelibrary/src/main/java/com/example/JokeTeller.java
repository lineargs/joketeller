package com.example;

import java.util.Random;

public class JokeTeller {

    private String[] jokes = {
            "What do you call a programmer from Finland? -Nerdic",
            "What is a programmer's favourite hangout place? -Foo Bar",
            "Why did the programmer quit his job? -Because he didn't get arrays",
            "0 is false and 1 is true, right? -1",
            "Why do Java programmers have to wear glasses? -Because they don't see C#",
            "Real programmers count from 0",
            "Chuck Norris can take a screenshot of his blue screen"
    };

    private Random random = new Random();

    public String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
