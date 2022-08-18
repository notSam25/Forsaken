package Forsaken.GFX;

import Forsaken.Global;
import Forsaken.Util.KeyboardListener;
import Forsaken.Util.MouseListener;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public static final Render render = new Render();
    public void initWindow() {
        render.setPreferredSize(new Dimension(Global.screenWidth, Global.screenHeight));
        render.setDoubleBuffered(true);

        this.setTitle(Global.windowName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.add(render);
        this.pack();
        this.setLocation(new Point(Global.screenResolution.width / 4, Global.screenResolution.height / 4));
        this.setVisible(true);

        this.addMouseListener(MouseListener.getListener());
        this.addKeyListener(KeyboardListener.getListener());
    }

    public void gameLoop() {

        double interval = (double) 1000000000 / (double)Global.targetTPS, nextDrawTime = interval + System.nanoTime(); // TPS in NS
        double now = System.nanoTime();
        int TPS = 0;
        while(!Global.closeGame) {

            //System.out.println("frame start");
            // Input handler updates
            KeyboardListener.update();
            MouseListener.update();

            // Call current level update/tick
            Global.gameState.update();

            // Draw screen
            render.repaint();

            //System.out.println("frame end");

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
