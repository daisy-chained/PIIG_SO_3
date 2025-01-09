package TestingPuzzleSystem;

import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.GameLoop;
import nl.saxion.app.interaction.KeyboardEvent;
import nl.saxion.app.interaction.MouseEvent;

public class BasicGame implements GameLoop {

    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGame(), 1000, 1000, 40);
    }

    @Override
    public void init() {
        boolean[] inventory = new boolean[3];
            for (int i=0; i < inventory.length; i++) {
                inventory[i] = false;
            }
        inventory[0] = false;
        inventory[1] = false;
        inventory[2] = false;
        inventory[3] = false;
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






