package Forsaken.Util;

import java.awt.event.*;

// credit to: https://github.com/jdah/microcraft/blob/master/src/com/jdh/microcraft/util/Keyboard.java
public class KeyboardListener {

    public static final Key[] keys = new Key[1024];

    static {
        for (int i = 0; i < keys.length; i++) {
            keys[i] = new Key();
        }
    }

    public static KeyListener getListener() {
        return new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                KeyboardListener.keys[e.getKeyCode()].down = true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                KeyboardListener.keys[e.getKeyCode()].down = false;

            }
        };
    }

    public static void update() {
        for (Key key : keys) {
            key.pressed = key.down && !key.last;
            key.last = key.down;
        }
    }

    public static class Key {
        public boolean down, pressed, last;
    }

    public static int GetKey(char key) {
        return KeyEvent.getExtendedKeyCodeForChar(key);
    }
}
