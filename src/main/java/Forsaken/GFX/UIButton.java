package Forsaken.GFX;

import Forsaken.Util.MouseListener;

import javax.swing.*;
import java.awt.*;

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
        return mouseDown && contains(sprite.transform, pos);
    }

    @Override
    public void setPosition(Rectangle position) {
        sprite.transform = position;
    }

    @Override
    public Rectangle getBounds() {
        return sprite.transform;
    }

    @Override
    public boolean isDown() {
        boolean mouseDown = MouseListener.buttons[MouseListener.MouseButton.MOUSE_LEFT.ordinal()].down;
        Point pos = MouseListener.getMouseWindowPosition();
        return mouseDown && contains(sprite.transform, pos);
    }

    private final Sprite sprite;
}
