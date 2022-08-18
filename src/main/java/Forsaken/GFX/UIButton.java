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
        if(mouseDown) {
            System.out.println("Mouse pos: " + MouseListener.getMouseWindowPosition() + "button bounds: " + sprite.transform);
        }
        return mouseDown && sprite.transform.contains(MouseListener.getMouseWindowPosition());
    }

    @Override
    public void setPosition(Rectangle position) {
        sprite.transform = position;
    }

    private final Sprite sprite;
}
