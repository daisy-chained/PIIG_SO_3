package codeScene1;

import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.GameLoop;
import nl.saxion.app.interaction.KeyboardEvent;
import nl.saxion.app.interaction.MouseEvent;

public class BasicGame implements GameLoop {

    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGame(), 1300, 800, 40);
    }

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        SaxionApp.clear();
        SaxionApp.drawImage("BasicGame/resources/background scene1.png",0, 0, 1300, 800);
        SaxionApp.drawImage("BasicGame/resources/BISH.png",50, 440, 350, 300);
        SaxionApp.drawImage("BasicGame/resources/Can.png",600, 580, 100, 100);
    }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {

    }

    boolean mousePressed = false;

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {
        int mouseX = mouseEvent.getX();
        int mouseY = mouseEvent.getY();
        int leftBorderWidth = 50;

        if (mouseEvent.isMouseDown() && !mousePressed) {
            mousePressed = true;
            System.out.println("Clicked at (" + mouseX + ", " + mouseY + ")");

            int canX = 600;
            int canY = 580;
            int canWidth = 100;
            int canHeight = 100;

            if (mouseEvent.isMouseDown()) {
                if (mouseX >= canX && mouseX <= canX + canWidth &&
                    mouseY >= canY && mouseY <= canY + canHeight) {
                    System.out.println("Clicked on the can!");
                }
            }
            if (mouseEvent.isMouseUp()) {
                mousePressed = false;
            }
        }
        if (mouseEvent.isMouseDown()) {
            if (mouseX >= 0 && mouseX <= leftBorderWidth) {
                System.out.println("Clicked at (" + mouseX + ", " + mouseY + ")");
                System.out.println("clicked on left border, you're leaving the scene!");
            }
        }
    }
}






