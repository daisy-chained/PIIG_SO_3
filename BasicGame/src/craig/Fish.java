package craig;

import nl.saxion.app.SaxionApp;

public class Fish {
    int x,y,width,height;
    String image;

    public Fish(int x, int y, int width, int height, String image) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = image;
    }

    public void draw(){
        SaxionApp.drawImage(image,x,y,width,height);
        x++;
        y++;
        if(x>1000){
            x=0;
        }
        if(y>1000){
            y=0;
        }
    }
    public boolean isClicked(int x, int y){
        return x>=this.x && x<=(this.x+width) && y>=this.y && y<=(this.y+height);
    }
}
