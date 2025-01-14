package basicGameloop;

import nl.saxion.app.interaction.MouseEvent;

public class inSceneMouseEvents {

    public static void click(MouseEvent mouseEvent, int sceneCounter) {
        if(mouseEvent.isMouseDown()){
        switch (sceneCounter) {
            case 0:
                if(mouseEvent.getX()>=600 && mouseEvent.getX() <=736 && mouseEvent.getY() >=580 && mouseEvent.getY()<=706 ){

                }
                break;
            case 1:
                if(mouseEvent.getX()>= && mouseEvent.getX() <= && mouseEvent.getY() >= && mouseEvent.getY() <= ){

                }
                break;
            case 2:
                if(mouseEvent.getX()>= && mouseEvent.getX() <= && mouseEvent.getY() >= && mouseEvent.getY() <= ){

                }
                break;
            case 3:
                if(mouseEvent.getX()>= && mouseEvent.getX() <= && mouseEvent.getY() >= && mouseEvent.getY() <= ){

                }
                break;
            case 4:
                if(mouseEvent.getX()>= && mouseEvent.getX() <= && mouseEvent.getY() >= && mouseEvent.getY() <= ){

                }
                break;
            default:
                break;
        }}
    }


}
