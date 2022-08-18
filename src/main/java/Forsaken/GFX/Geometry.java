package Forsaken.GFX;

import java.awt.*;

public class Geometry {
    public enum ObjetType {
        NONE,
        STRING,
        RECT,
        FILLRECT,
        LINE
    }
    public ObjetType type = ObjetType.NONE;
    public String text = new String();
    public Rectangle position;
    public Color color;
    public Font font;
}
