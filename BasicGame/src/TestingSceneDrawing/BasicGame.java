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
    Color myColor = SaxionApp.createColor(135, 206, 250);
    public boolean isFishClicked = false;
    @Override
    public void init() {
        SaxionApp.turnBorderOff();
    }
    @Override
    public void loop() {
            SaxionApp.clear();

        SaxionApp.setFill(myColor);
        SaxionApp.drawRectangle(0, 0, 1000, 1000);

            fishX += fishSpeed;
            if (fishX > 640 || fishX < 0) {
                fishSpeed *= -1;
            }
        SaxionApp.setFill(Color.RED);
        SaxionApp.drawRectangle(fishX, fishY, 50, 30);
        SaxionApp.drawRectangle(200, 400, 100, 50);
            }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {

        if (mouseEvent.isMouseDown() &&
                mouseEvent.getX() >= fishX - 50 && mouseEvent.getX() <= fishX + 50 &&
                mouseEvent.getY() >= fishY - 30 && mouseEvent.getY() <= fishY + 30)
        {
            SaxionApp.printLine("Fish Clicked");
            isFishClicked = true;

        }
    }

}






