package TestingPuzzleSystem;

import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.GameLoop;

import java.util.ArrayList;

public class BasicGame implements GameLoop {

    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGame(), 1000, 1000, 40);
    }

    @Override
    public void init() {
        boolean[] inventory = new boolean[4];
            for (int i=0; i < inventory.length; i++) {
                inventory[i] = false;

            }


        }


    }
