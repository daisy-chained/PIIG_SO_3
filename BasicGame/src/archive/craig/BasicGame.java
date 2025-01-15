package archive.craig;

import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.GameLoop;
import nl.saxion.app.interaction.KeyboardEvent;
import nl.saxion.app.interaction.MouseEvent;

public class BasicGame implements GameLoop {
    Fish[] fishes = new Fish[2];
    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGame(), 1000, 1000, 40);
    }

    @Override
    public void init() {
        fishes[0]=new Fish(100,100,50,50,"BasicGame/resources/BISH.png");
        fishes[1]=new Fish(500,700,50,50,"BasicGame/resources/BISH.png");
    }

    @Override
    public void loop() {
        SaxionApp.clear();
        for (int i = 0; i < fishes.length; i++) {
            fishes[i].draw();
        }
    }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {

    }
}






