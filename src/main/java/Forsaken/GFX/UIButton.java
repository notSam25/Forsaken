package Forsaken.GFX;

import Forsaken.Util.MouseListener;

import javax.swing.ImageIcon;
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
        if(mouseDown) {
            System.out.println("Mouse position: " + MouseListener.getMousePosition() + " Rect bounds: " + sprite.transform);
        }
        return mouseDown && sprite.transform.contains(MouseListener.getMousePosition());
    }

    @Override
    public void setPosition(Rectangle position) {
        sprite.transform = position;
    }

    private final Sprite sprite;
}
