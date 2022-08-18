package Forsaken.GFX;

import Forsaken.Global;
import Forsaken.Util.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class UIButton extends UIObject {
    public UIButton(Rectangle pos) {
        sprite = new Sprite(pos, new ImageIcon("src/main/resources/button_play.png"));
    }

    @Override
    public void render() {
        Render.sprites.add(sprite);
    }

    @Override
    public boolean isPressed() {
        boolean mouseDown = MouseListener.buttons[MouseListener.MouseButton.MOUSE_LEFT.ordinal()].pressed;
        Point pos = MouseListener.getMouseWindowPosition();
        if(mouseDown)
            System.out.println(pos + "button bounds: " + sprite.transform);

        return mouseDown && sprite.transform.contains(pos);
    }

    @Override
    public void setPosition(Rectangle position) {
        sprite.transform = position;
    }
    @Override public Rectangle getBounds() { return sprite.transform; }

    private final Sprite sprite;
}
