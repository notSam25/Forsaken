package Forsaken.GFX;

import java.awt.*;

public abstract class UIObject {
    // Class for buttons, text boxes, sliders, etc...
    // Once a UIObject is added in the GameState->render() function, it should handle all clicks and sounds in functions defined below.
    public abstract void render();
    public abstract boolean isPressed();
    public abstract  Rectangle getBounds();
    public abstract void setPosition(Rectangle position);
    public abstract boolean contains(Rectangle transform, Point pos);
}
