package Forsaken.Util;

import java.awt.Point;
import java.awt.event.*;

public class MouseListener {

    public static final Button[] buttons = new Button[100];

    static {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button();
        }
    }

    public static void Update() {
        for (Button button : buttons) {
            button.pressed = button.down && !button.last;
            button.last = button.down;
        }
    }

    public static class Button {
        public boolean down, pressed, pressedTick, last;
        public Point position;
    }

    public static int GetKey(char key) {
        return KeyEvent.getExtendedKeyCodeForChar(key);
    }

    public static java.awt.event.MouseListener getListener() {
        return new java.awt.event.MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                MouseListener.buttons[e.getButton()].position = e.getPoint();

                MouseListener.buttons[e.getButton()].down = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MouseListener.buttons[e.getButton()].position = e.getPoint();

                MouseListener.buttons[e.getButton()].down = false;
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
