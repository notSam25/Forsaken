package Forsaken.GFX;

import Forsaken.Global;
import Forsaken.Util.KeyboardListener;
import Forsaken.Util.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.security.Key;

public class Window extends JFrame {

    // Input handlers
    protected static KeyboardListener keyboardListener = new KeyboardListener();
    protected static MouseListener mouseListener = new MouseListener();

    private static Render render = new Render();
    public void initWindow() {
        Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
        render.setPreferredSize(new Dimension(600, 600));
        render.setDoubleBuffered(true);

        this.setTitle(Global.windowName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.add(render);
        this.pack();
        this.setLocation(new Point(100, 100));
        this.setVisible(true);

        this.addMouseListener(mouseListener.getListener());
        this.addKeyListener(keyboardListener.getListener());
    }
}
