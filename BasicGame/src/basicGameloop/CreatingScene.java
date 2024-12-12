package basicGameloop;

public class CreatingScene {
    int BishX,BishY,foregroundX,foregroundY;
    String background,foreground;
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
    }
}
