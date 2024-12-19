package TestingPuzzleSystem;

import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.GameLoop;
import nl.saxion.app.interaction.KeyboardEvent;
import nl.saxion.app.interaction.MouseEvent;

public class BasicGame2 implements GameLoop {

    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGame2(), 1000, 1000, 40);
    }

    @Override
    public void init() {
        boolean[] inventory = new boolean[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("inventory[" + i + "] = " + inventory[i]);
        }
    }

    @Override
    public void loop() {

    }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {

    }
}






