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

    public void gameLoop() {

        double interval = (double)(1000000000 / Global.targetTPS), nextDrawTime = interval + System.nanoTime(); // TPS in NS
        double now = System.nanoTime();
        int TPS = 0;
        while(!Global.closeGame) {

            // Input handler updates
            KeyboardListener.update();
            MouseListener.update();

            // Call current level update/tick
            Global.gameState.update();

            // Draw screen
            render.repaint();

            try {
                double remainder = nextDrawTime - System.nanoTime();
                remainder = remainder / 1000000000;
                TPS++;

                if(remainder < 0)
                    remainder = 0;

                if(System.nanoTime() >= now + 1000000000) {
                    System.out.println("TPS: " + TPS);
                    TPS = 0;
                    now = System.nanoTime();
                }

                Thread.sleep((long)remainder);
                nextDrawTime += interval;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
