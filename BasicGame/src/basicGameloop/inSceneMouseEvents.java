package basicGameloop;

import nl.saxion.app.interaction.MouseEvent;

public class inSceneMouseEvents {

    public static void click(MouseEvent mouseEvent, int sceneCounter) {
        if(mouseEvent.isMouseDown()){
        switch (sceneCounter) {
            case 0:
                if(mouseEvent.getX()>=600 && mouseEvent.getX() <=736 && mouseEvent.getY() >=580 && mouseEvent.getY()<=706 ){
                    System.out.println("0hit");
                }
                break;
            case 1:
                if(mouseEvent.getX()>=755 && mouseEvent.getX() <=955 && mouseEvent.getY() >=485 && mouseEvent.getY() <=685 ){
                System.out.println("1hit");
                }
                break;
            case 2:
                if(mouseEvent.getX()>=-50 && mouseEvent.getX() <=550 && mouseEvent.getY() >=100 && mouseEvent.getY() <=700 ){
                    System.out.println("2hit");
                }
                break;
            case 3:
                if(mouseEvent.getX()>=276 && mouseEvent.getX() <=876 && mouseEvent.getY() >=558 && mouseEvent.getY() <=708 ){
                    System.out.println("3hit");
                }
                break;
            case 4:
                if(mouseEvent.getX()>=600 && mouseEvent.getX() <=800 && mouseEvent.getY() >=580 && mouseEvent.getY() <=780 ){
                    System.out.println("4hit");
                }
                break;
            default:
                break;
        }}
    }


}
