package Forsaken.GFX;

import Forsaken.Global;

import javax.swing.*;
import java.awt.*;

public class Render extends JPanel {



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gather all render data for the current level
        Global.gameState.render();

        // Cleanup
        g.dispose();
    }
}
