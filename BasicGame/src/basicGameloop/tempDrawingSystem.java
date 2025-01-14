package basicGameloop;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class tempDrawingSystem {
    public static int ghostCount = 0;
    public static int fontSize = 25;
    public static int[] textCount = new int[5];
    public static boolean[] noneleft = new boolean[4];
    public static int choiceCount = 0;

    public static void draw(int sceneCounter) {
        SaxionApp.setTextDrawingColor(Color.black);
        switch (sceneCounter) {
            case 0:
                if (!noneleft[sceneCounter]) {
                    switch (textCount[sceneCounter]) {
                        case 0:
                            SaxionApp.drawText("*wailing heard from the left*", 0, 300, fontSize);
                            break;
                        case 1:
                            SaxionApp.drawText("What the Fuck was that?", 0, 300, fontSize);
                            break;
                        case 2:
                            SaxionApp.drawText("I really want to fucking know who woke me up", 0, 300, fontSize);
                            break;
                        default:
                            noneleft[sceneCounter] = true;
                            BasicGame.scene[sceneCounter].exitLeft = true;
                            break;
                    }
                }
                break;
            case 1:
                if (!noneleft[sceneCounter]) {
                    switch (textCount[sceneCounter]) {
                        case 1:
                            SaxionApp.drawText(" Seriously?! I had a perfect dream,  What is wrong with you?!", 250, 351, fontSize);
                            SaxionApp.drawText("and you just had to ruin it with your ghostly karaoke session.", 250, 401, fontSize);
                            break;
                        case 2:
                            SaxionApp.drawText("Ahh, finally someone is here…. I was not singing! ", 555, 385, fontSize);
                            SaxionApp.drawText("I was… lamenting! I have drowned. ", 555, 405, fontSize);
                            SaxionApp.drawText("My spirit cannot rest until someone helps me fulfil my last wishes!", 555, 430, fontSize);
                            break;
                        case 3:
                            SaxionApp.drawText("The fuck do you want me to do about it?", 250, 351, fontSize);
                            break;
                        case 4:
                            SaxionApp.drawText("I would need you to get my family fishing net.", 555, 385, fontSize);
                            SaxionApp.drawText("then the stick i had to drop in cave", 555, 405, fontSize);
                            SaxionApp.drawText("and finally i need you to show me that you can catch a shrimp", 555, 430, fontSize);
                            break;
                        default:
                            SaxionApp.drawText("1.Go find someone else, I'd rather feed you to the sharks!(good ending)", 250, 385, fontSize);
                            SaxionApp.drawText("2.Seriously? Why would I help a shitty human ghost?(medium ending)", 250, 405, fontSize);
                            SaxionApp.drawText("3. ah fuck oke il help you.(bad ending)", 250, 430, fontSize);
                        case 10000:

                            switch (BasicGame.choice) {

                                case 49:
                                    switch (choiceCount) {
                                        case 0:
                                            SaxionApp.drawText("Go find someone else, I’d rather feed you to the sharks.", 250, 351, fontSize);
                                            break;
                                        case 1:
                                            SaxionApp.drawText("How can you be this cruel", 555, 385, fontSize);
                                            break;
                                        case 2:
                                            //good ending?
                                            break;
                                        default:
                                            noneleft[sceneCounter] = true;
                                            break;
                                    }
                                    break;
                                case 50:
                                    switch (choiceCount) {
                                        case 0:
                                            SaxionApp.drawText("Seriously? Why would I help a shitty human ghost?", 250, 351, fontSize);
                                            break;
                                        case 1:
                                            SaxionApp.setTextDrawingColor(Color.cyan);
                                            SaxionApp.drawText("If you don't help me move on... I will be stuck here, FOREVER!", 555, 385, fontSize);
                                            break;
                                        default:
                                            noneleft[sceneCounter] = true;
                                            break;
                                    }
                                    break;
                                case 51:
                                    switch (choiceCount) {
                                        case 0:
                                            SaxionApp.drawText("ah fuck oke il help you.", 250, 351, fontSize);
                                            break;
                                        case 1:
                                            SaxionApp.setTextDrawingColor(Color.cyan);
                                            SaxionApp.drawText("OH MY GOD THANK YOU SO MUCH, BISH!", 555, 385, fontSize);
                                            break;
                                        default:
                                            noneleft[sceneCounter] = true;
                                            break;
                                    }
                                    break;
                            }

                        case 100000:
                            if (!noneleft[sceneCounter]) {
                                switch (BasicGame.choice) {
                                    case 49:
                                        SaxionApp.drawText("*quietly sobbing*", 555, 430, fontSize);
                                        BasicGame.scene[1].exitLeft = true;
                                        break;
                                    case 50:
                                        SaxionApp.drawText("*quietly sobbing*", 555, 430, fontSize);
                                        BasicGame.scene[1].exitLeft = true;
                                        break;
                                    case 51:
                                        SaxionApp.drawText("*happy noises:3*", 555, 430, fontSize);
                                        BasicGame.scene[1].exitLeft = true;
                                        break;

                                }
                            }
                            break;
                    }
                }
                break;

            case 2:

            case 3:

                break;
            case 4:

                break;
            default:
                System.err.println("invalid scene counter: " + sceneCounter + "tempdrawingsystem");
                break;
        }
    }
}
