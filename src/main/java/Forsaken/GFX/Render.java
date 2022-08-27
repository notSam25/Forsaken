package Forsaken.GFX;

import Forsaken.Global;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Render extends JPanel {

    // Draw data
    public static Vector<Sprite> sprites = new Vector<>();
    public static Vector<Geometry> objects = new Vector<>();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gather all render data for the current level
        Global.gameState.render();

        for(Geometry object : objects) {
            switch(object.type) {
                case NONE: {
                    System.out.println("Invalid object at: " + object);
                }
                    break;
                case STRING: {
                    g.setFont(object.font);
                    g.drawString(object.text, object.position.x, object.position.y);
                }
                case RECT: {
                    g.setColor(object.color);
                    g.drawRect(object.position.x, object.position.y, object.position.width, object.position.height);
                }
                    break;
                case FILLRECT: {
                    g.setColor(object.color);
                    g.drawRect(object.position.x, object.position.y, object.position.width, object.position.height);
                }
                    break;
                case LINE: {
                    g.setColor(object.color);
                    g.drawLine(object.position.x, object.position.y, object.position.width, object.position.height);
                }
                    break;
            }
        }

        for (Sprite sprite : sprites) {
            g.drawImage(sprite.getImage(), sprite.transform.x, sprite.transform.y, sprite.transform.width,
                    sprite.transform.height, null);
        }

        // Cleanup
        sprites.clear();
        objects.clear();
        g.dispose();
    }
}
