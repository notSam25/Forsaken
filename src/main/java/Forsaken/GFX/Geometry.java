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

    public String text;
    public Rectangle position;
    public Color color;
    public Font font;
    public Geometry() {
    }
    public Geometry(ObjetType _type, Rectangle _position, Color _color) {
        this.type = _type;
        this.position = _position;
        this.color = _color;
    }
    public Geometry(ObjetType _type, Rectangle _position, Color _color, String _text, Font _font) {
        this.type = _type;
        this.position = _position;
        this.color = _color;
        this.text = _text;
        this.font = _font;
    }
}
