package basicGameloop;

import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.GameLoop;
import nl.saxion.app.interaction.KeyboardEvent;
import nl.saxion.app.interaction.MouseEvent;


public class BasicGame implements GameLoop {

    public static void main(String[] args) {
        SaxionApp.startGameLoop(new BasicGame(), 1300, 800, 40);
    }

    static CreatingScene[] scene = new CreatingScene[5];
    int sceneCounter = 0;

    @Override
    public void init() {

        scene[0] = new CreatingScene(50, 440, 600, 580, 136, 126, "BasicGame/resources/background scene1.png", "BasicGame/resources/Can.png", true, false, "BasicGame/resources/BISH.png");
        scene[1] = new CreatingScene(360, 452, 755, 485, 200, 200, "BasicGame/resources/background scene2.png", "BasicGame/resources/Ghost.png", true, true, "BasicGame/resources/BISH.png");
        scene[2] = new CreatingScene(720, 244, -50, 100, 600, 600, "BasicGame/resources/background scene3.png", "BasicGame/resources/Fishing net normal.png", true, true, "BasicGame/resources/BISH2.png");
        scene[3] = new CreatingScene(816, 215, 276, 558, 600, 150, "BasicGame/resources/background scene4.png", "BasicGame/resources/Stick.png", true, true, "BasicGame/resources/BISH2.png");
        scene[4] = new CreatingScene(850, 440, 600, 580, 200, 200, "BasicGame/resources/background scene5.png", "BasicGame/resources/Can.png", false, true, "BasicGame/resources/BISH2.png");
    }

    @Override
    public void loop() {
        SaxionApp.clear();
        scene[sceneCounter].Draw();
        inventory.draw();

    }

    @Override
    public void keyboardEvent(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKeyCode() == KeyboardEvent.VK_ESCAPE) {
            System.exit(0);

        }
    }

    @Override
    public void mouseEvent(MouseEvent mouseEvent) {
        sceneCounter = sceneCounter + scene[sceneCounter].changeScene(mouseEvent);
        inSceneMouseEvents.click(mouseEvent, sceneCounter);
    }
}






