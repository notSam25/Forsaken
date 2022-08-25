package Forsaken.GFX;

import java.awt.*;

public abstract class UIObject {
    
    public abstract void render();

    public abstract boolean contains(Rectangle transform, Point pos);
    public abstract Rectangle getBounds();
    public abstract void setPosition(Rectangle position);

    // UIObject states
    public abstract boolean isPressed();
    public abstract boolean isDown();
}
