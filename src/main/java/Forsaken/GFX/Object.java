package Forsaken.GFX;

import java.awt.*;

public class Object {

    public ObjetType type = ObjetType.NONE;

    public String text = "";
    public Rectangle position;
    public Color color;
    public Font font;
    public Object() {
    }
    public Object(ObjetType _type, Rectangle _position, Color _color) {
        this.type = _type;
        this.position = _position;
        this.color = _color;
    }
    public Object(ObjetType _type, Rectangle _position, Color _color, String _text, Font _font) {
        this.type = _type;
        this.position = _position;
        this.color = _color;
        this.text = _text;
        this.font = _font;
    }
    public enum ObjetType {
        NONE, STRING, RECT, FILLRECT, LINE
    }
}
