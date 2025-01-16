import nl.saxion.app.SaxionApp;
import nl.saxion.app.interaction.MouseEvent;

public class CreatingScene {
    int BishX, BishY, foregroundX, foregroundY, foregroundWidth, foregroundHeight, backgroundX, backgroundY;
    String background, foreground, BishImage;
    Boolean exitLeft, exitRight;

    public CreatingScene(int bishX, int bishY, int foregroundX, int foregroundY, int foregroundWidth, int foregroundHeight, String background, String foreground, Boolean exitLeft, Boolean exitRight, String bishImage) {
        BishX = bishX;
        BishY = bishY;
        this.foregroundX = foregroundX;
        this.foregroundY = foregroundY;
        this.foregroundWidth = foregroundWidth;
        this.foregroundHeight = foregroundHeight;
        this.background = background;
        this.foreground = foreground;
        this.exitLeft = exitLeft;
        this.exitRight = exitRight;
        this.BishImage = bishImage;
//        BishImage = "BasicGame/resources/BISH.png";
        backgroundX = 1300;
        backgroundY = 800;

    }

    public void Draw() {

        SaxionApp.drawImage(background, 0, 0, backgroundX, backgroundY);
        SaxionApp.drawImage(foreground, foregroundX, foregroundY, foregroundWidth, foregroundHeight);
        SaxionApp.drawImage(BishImage, BishX, BishY);
        if (exitLeft) {
            SaxionApp.drawImage("BasicGame/resources/left.png", 0, 0, 100, 100);
        }
        if (exitRight) {
            SaxionApp.drawImage("BasicGame/resources/right.png", 1200, 0, 100, 100);
        }
    }

    public int changeScene(MouseEvent mouseEvent) {


        if (mouseEvent.isMouseDown()) {
            if (mouseEvent.getX() >= 1100 && exitRight) {

                return -1;

            } else if (mouseEvent.getX() <= 400 && exitLeft) {

                return +1;
            }


        }

        return 0;
    }
}
