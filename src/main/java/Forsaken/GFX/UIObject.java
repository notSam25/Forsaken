package Forsaken.GFX;

import java.awt.*;

public abstract class UIObject {
    
    public abstract void render();

    public abstract Rectangle getBounds();
    public abstract void setPosition(Rectangle position);

    public boolean contains(Rectangle transform, Point pos) {
        return (pos.x >= transform.x && pos.x <= (transform.x + transform.width))
                && (pos.y >= transform.y && pos.y <= (transform.y + transform.height));
    }

    // UIObject states
    public abstract boolean isPressed();
    public abstract boolean isDown();
}
