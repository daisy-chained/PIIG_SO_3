package archive.TestingMouseEvents;

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

    }

    @Override
    public void loop() {

    }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {
        int mouseX = mouseEvent.getX();
        int mouseY = mouseEvent.getY();
        System.out.println("Mouse clicked");
        System.out.println("Clicked at (" + mouseX + ", " + mouseY + ")");

        if (mouseEvent.isMouseDown()) {
            if (mouseX >= 100 && mouseY <= 300) {
               System.out.println("Clicked in the right area!");
            }
        }
}
}