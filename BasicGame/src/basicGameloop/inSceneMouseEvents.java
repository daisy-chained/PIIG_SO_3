package basicGameloop;

import nl.saxion.app.interaction.MouseEvent;

public class inSceneMouseEvents {
    public static int scene2Counter = 0;

    public static void click(MouseEvent mouseEvent, int sceneCounter) {
        if (mouseEvent.isMouseDown()) {
            tempDrawingSystem.textCount[sceneCounter]++;
            switch (sceneCounter) {
                case 0:
                    if (mouseEvent.getX() >= 600 && mouseEvent.getX() <= 736 && mouseEvent.getY() >= 580 && mouseEvent.getY() <= 706) {
                        inventory.myShit[0] = true;
                        BasicGame.scene[0].foregroundX = 100000;
                    }
                    break;
                case 1:
                    if (mouseEvent.getX() >= 755 && mouseEvent.getX() <= 955 && mouseEvent.getY() >= 485 && mouseEvent.getY() <= 685&&tempDrawingSystem.noneleft[sceneCounter]) {
                       if(inventory.myShit[3]){
                           tempDrawingSystem.draw(6);
                       }
                        if(inventory.myShit[1]&&inventory.myShit[2]){
                            tempDrawingSystem.draw(7);
                        }
                        tempDrawingSystem.textCount[sceneCounter] = 100000;

                    }
                    break;
                case 2:
                    if (mouseEvent.getX() >= -50 && mouseEvent.getX() <= 550 && mouseEvent.getY() >= 100 && mouseEvent.getY() <= 700) {
                        if (inventory.myShit[0] && scene2Counter == 2) {

                            BasicGame.scene[2].foregroundX = 100000;
                            inventory.myShit[1] = true;
                            BasicGame.scene[2].exitLeft = true;
                        }
                        scene2Counter++;
                    }
                    break;
                case 3:
                    if (mouseEvent.getX() >= 276 && mouseEvent.getX() <= 876 && mouseEvent.getY() >= 558 && mouseEvent.getY() <= 708) {
                        inventory.myShit[2] = true;
                        BasicGame.scene[3].foregroundX = 100000;
                    }
                    break;
                case 4:
                    if (mouseEvent.getX() >= 600 && mouseEvent.getX() <= 800 && mouseEvent.getY() >= 580 && mouseEvent.getY() <= 780) {
                        if (inventory.myShit[1] && inventory.myShit[2]) {
                            BasicGame.scene[4].foregroundX = 100000;
                            inventory.myShit[3] = true;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }


}
