package TestingSceneDrawing;

import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.GameLoop;
import nl.saxion.app.interaction.KeyboardEvent;
import nl.saxion.app.interaction.MouseEvent;

import java.awt.*;

public class BasicGame implements GameLoop {

    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGame(), 1000, 1000, 40);
    }

    private int fishX = 100;
    private int fishY = 300;
    private int fishSpeed = 2;

    @Override
    public void init() {
        SaxionApp.turnBorderOff();
    }

    @Override
    public void loop() {
            SaxionApp.clear();

        drawBackground(135, 206, 250);
        Color myColor = SaxionApp.createColor(135, 206, 250);
        SaxionApp.setBackgroundColor(myColor);

            fishX += fishSpeed;
            if (fishX > 640 || fishX < 0) {
                fishSpeed *= -1;
            }
        drawBackground(255, 165, 0);
        SaxionApp.drawRectangle(fishX, fishY, 50, 30);
            }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {


    }

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {



    }
    public void drawBackground(int red, int green, int blue) {
    }
}






