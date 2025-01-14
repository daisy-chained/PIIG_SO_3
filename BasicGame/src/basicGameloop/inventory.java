package basicGameloop;

import nl.saxion.app.SaxionApp;

public class inventory {
    static boolean[] myShit = new boolean[4];


    public static void draw() {
        SaxionApp.drawImage("BasicGame/resources/bubbles.png", 475, 700, 388, 100);
        for (int i = 0; i < myShit.length; i++) {
            if (myShit[i]) {
                switch (i) {
                    case 0:
                        SaxionApp.drawImage("BasicGame/resources/Can.png", 500, 710, 75, 75);
                        break;
                    case 1:
                        SaxionApp.drawImage("BasicGame/resources/Fishing net normal.png", 575, 715, 75, 75);
                        break;
                    case 2:
                        SaxionApp.drawImage("BasicGame/resources/stick.png", 660, 715, 100, 65);
                        break;
                    case 3:
                        SaxionApp.drawImage("BasicGame/resources/Fishing net normal.png", 760, 715, 75, 75);
                }
            }
        }
    }
}

