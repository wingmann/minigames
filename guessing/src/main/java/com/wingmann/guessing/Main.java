package com.wingmann.guessing;

import com.wingmann.game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new GuessingGame();
        game.play();
    }
}
