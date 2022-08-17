package Forsaken.GFX;

import Forsaken.Global;
import Forsaken.Util.KeyboardListener;
import Forsaken.Util.MouseListener;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static final Render render = new Render();
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

        this.addMouseListener(MouseListener.getListener());
        this.addKeyListener(KeyboardListener.getListener());
    }
}
