package Forsaken.Util;

import java.awt.*;
import java.awt.event.*;

public class MouseListener {

    public static final Button[] buttons = new Button[3];

    static {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button();
        }
    }

    private static Point mousePosition;
    public static Point getMousePosition() {
        return mousePosition;
    }

    public static void update() {
        for (Button button : buttons) {
            button.pressed = button.down && !button.last;
            button.last = button.down;
        }

        mousePosition = MouseInfo.getPointerInfo().getLocation();
    }

    public static class Button {
        public boolean down, pressed, pressedTick, last;
    }

    public static java.awt.event.MouseListener getListener() {
        return new java.awt.event.MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mouse pressed " + e.getButton());
                MouseListener.buttons[e.getButton() - 1].down = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MouseListener.buttons[e.getButton() - 1].down = false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        };
    }
}
