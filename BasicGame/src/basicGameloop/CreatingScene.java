package basicGameloop;

import nl.saxion.app.SaxionApp;

public class CreatingScene {
    int BishX,BishY,foregroundX,foregroundY,backgroundX,backgroundY;
    String background,foreground,BishImage;
    Boolean exitLeft,exitRight;

    public CreatingScene(int bishX, int bishY, int foregroundX, int foregroundY, String background, String foreground, Boolean exitLeft, Boolean exitRight) {
        BishX = bishX;
        BishY = bishY;
        this.foregroundX = foregroundX;
        this.foregroundY = foregroundY;
        this.background = background;
        this.foreground = foreground;
        this.exitLeft = exitLeft;
        this.exitRight = exitRight;
        BishImage = "BasicGame/resources/BISH.png";
        backgroundX = 1300;
        backgroundY = 800;

    }
    public Draw(){
        SaxionApp.drawImage(BishImage,BishX,BishY);
        SaxionApp.drawImage(background,0,0,backgroundX,backgroundY);
        SaxionApp.drawImage(foreground,foregroundX,foregroundY);
    }
}
