package basicGameloop;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class tempDrawingSystem {
    public static int ghostCount = 0;
    public static int fontSize = 25;

    public static void ghostDialoge() {
        SaxionApp.setTextDrawingColor(Color.black);
        switch (ghostCount) {
            case 1:

                SaxionApp.drawText(" Seriously?! I had a perfect dream,  What is wrong with you?!",
                        250, 351, fontSize);
                SaxionApp.drawText("and you just had to ruin it with your ghostly karaoke session.",250,401,fontSize);
                break;
            case 2:
                SaxionApp.drawText("Ahh, finally someone is here…. I was not singing! ",555,385,fontSize);
                SaxionApp.drawText("I was… lamenting! I have drowned. ",555,405,fontSize);
                SaxionApp.drawText("My spirit cannot rest until someone helps me fulfil my last wishes!",555,430,fontSize);
                break;
            case 3:
                break;
            case 4:

        }
    }

    public static void draw(int sceneCounter) {
        switch (sceneCounter) {
            case 0:
                break;
            case 1:
                ghostDialoge();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    }
}
