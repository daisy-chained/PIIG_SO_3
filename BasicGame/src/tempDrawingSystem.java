import nl.saxion.app.SaxionApp;

import java.awt.*;

public class tempDrawingSystem {
    public static boolean showchoices = true;
    public static int fontSize = 25;
    public static int[] textCount = new int[5];
    public static boolean[] noneleft = new boolean[5];
    public static int choiceCount = 0;


    public static void draw(int sceneCounter) {
        SaxionApp.setTextDrawingColor(Color.black);
        switch (sceneCounter) {
            case 0:
                if (!noneleft[sceneCounter]) {
                    switch (textCount[sceneCounter]) {
                        case 0:
                            SaxionApp.drawBorderedText("*wailing heard from the left*", 0, 300, fontSize);
                            break;
                        case 1:
                            SaxionApp.drawBorderedText("What the Fuck was that?", 0, 300, fontSize);
                            break;
                        case 2:
                            SaxionApp.drawBorderedText("I really want to fucking know who woke me up", 0, 300, fontSize);
                            break;
                        default:
                            noneleft[sceneCounter] = true;
                            BasicGame.scene[sceneCounter].exitLeft = true;
                            break;
                    }
                }
                break;
            case 1:
                switch (textCount[sceneCounter]) {
                    case 1:
                        if (!noneleft[sceneCounter]) {
                            SaxionApp.drawBorderedText(" Seriously?! I had a perfect dream,  What is wrong with you?!", 250, 351, fontSize);
                            SaxionApp.drawBorderedText("and you just had to ruin it with your ghostly karaoke session.", 250, 401, fontSize);
                        }
                        break;
                    case 2:
                        if (!noneleft[sceneCounter]) {

                            SaxionApp.drawBorderedText("Ahh, finally someone is here…. I was not singing! ", 555, 385, fontSize);
                            SaxionApp.drawBorderedText("I was… lamenting! I have drowned. ", 555, 405, fontSize);
                            SaxionApp.drawBorderedText("My spirit cannot rest until someone helps me fulfil my last wishes!", 555, 430, fontSize);
                        }
                        break;
                    case 3:
                        if (!noneleft[sceneCounter]) {
                            SaxionApp.drawBorderedText("The fuck do you want me to do about it?", 250, 351, fontSize);
                        }
                        break;
                    case 4:
                        if (!noneleft[sceneCounter]) {
                            SaxionApp.drawBorderedText("I would need you to get my family fishing net.", 555, 385, fontSize);
                            SaxionApp.drawBorderedText("then the stick i had to drop in cave", 555, 405, fontSize);
                            SaxionApp.drawBorderedText("and finally i need you to show me that you can catch a shrimp", 555, 430, fontSize);
                        }
                        break;
                    default:
                        if (showchoices) {
                            SaxionApp.drawBorderedText("1.Go find someone else, I'd rather feed you to the sharks!(good ending)", 250, 385, fontSize);
                            SaxionApp.drawBorderedText("2.Seriously? Why would I help a shitty human ghost?(medium ending)", 250, 405, fontSize);
                            SaxionApp.drawBorderedText("3. ah fuck oke il help you.(bad ending)", 250, 430, fontSize);
                        }
                    case 10000:
                        if (!noneleft[sceneCounter]) {

                            switch (BasicGame.choice) {

                                case 49:
                                    showchoices = false;
                                    switch (choiceCount) {
                                        case 0:
                                            SaxionApp.drawBorderedText("Go find someone else, I’d rather feed you to the sharks.", 250, 351, fontSize);
                                            BasicGame.scene[1].exitLeft = true;
                                            break;
                                        case 1:
                                            SaxionApp.drawBorderedText("How can you be this cruel", 555, 385, fontSize);

                                            break;
                                        case 2:
                                            //good ending?
                                            break;

                                    }
                                    break;
                                case 50:
                                    showchoices = false;
                                    switch (choiceCount) {

                                        case 0:
                                            SaxionApp.drawBorderedText("Seriously? Why would I help a shitty human ghost?", 250, 351, fontSize);
                                            BasicGame.scene[1].exitLeft = true;
                                            break;
                                        case 1:
                                            SaxionApp.setTextDrawingColor(Color.cyan);
                                            SaxionApp.drawBorderedText("If you don't help me move on... I will be stuck here, FOREVER!", 555, 385, fontSize);
                                            break;
                                    }
                                    break;
                                case 51:
                                    showchoices = false;
                                    switch (choiceCount) {
                                        case 0:
                                            SaxionApp.drawBorderedText("ah fuck oke il help you.", 250, 351, fontSize);
                                            BasicGame.scene[1].exitLeft = true;
                                            break;
                                        case 1:
                                            SaxionApp.setTextDrawingColor(Color.cyan);
                                            SaxionApp.drawBorderedText("OH MY GOD THANK YOU SO MUCH, BISH!", 555, 385, fontSize);
                                            break;
                                        default:

                                            break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 100000:

                        switch (BasicGame.choice) {
                            case 49:
                                SaxionApp.drawBorderedText("*quietly sobbing*", 555, 430, fontSize);
                                BasicGame.scene[1].exitLeft = true;
                                break;
                            case 50:
                                SaxionApp.drawBorderedText("*quietly sobbing*", 555, 430, fontSize);
                                BasicGame.scene[1].exitLeft = true;
                                break;
                            case 51:
                                SaxionApp.drawBorderedText("*happy noises:3*", 555, 430, fontSize);
                                BasicGame.scene[1].exitLeft = true;
                                break;

                        }

                        break;
                }

                break;

            case 2:
                //the hint/text for scene3
                noneleft[sceneCounter - 1] = true;
                if (!noneleft[sceneCounter]) {
                    SaxionApp.drawBorderedText("A yes a net, i can probably cut this down.", 555, 385, fontSize);
                    SaxionApp.drawBorderedText("if i had something sharp.", 555, 410, fontSize);


                }
                break;
            case 3:
                //hint for scene 4

                if (!noneleft[sceneCounter]) {
                    SaxionApp.drawBorderedText("why the fuck am i even doing this? ", 555, 385, fontSize);
                    SaxionApp.drawBorderedText("Welp lets see if we can find that shrimp.", 555, 410, fontSize);
                    noneleft[sceneCounter - 1] = true;

                }
                break;
            case 4:
                //stuff for scene 5

                if (!noneleft[sceneCounter]) {
                    SaxionApp.drawBorderedText("How the fuck am i supposed to catch that shrimp", 555, 385, fontSize);
                    SaxionApp.drawBorderedText("because just a net isn't going to cut it.", 555, 410, fontSize);
                    noneleft[sceneCounter - 1] = true;


                }
                break;
            case 5:

                break;
            case 6:

                break;
            default:
                System.err.println("invalid scene counter: " + sceneCounter + "tempdrawingsystem");
                break;
        }
    }
}
