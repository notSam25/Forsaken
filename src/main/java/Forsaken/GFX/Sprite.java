package Forsaken.GFX;

import java.awt.*;
import javax.swing.ImageIcon;

public class Sprite {
    // X, Y, Width, Height
    public Rectangle pos;
    public static Image image;

    public Sprite() {};
    public Sprite(Rectangle _pos, ImageIcon imageIcon) {
        pos = _pos;
        setImage(imageIcon);
    };

    public static void setImage(ImageIcon imageIcon) {
        image = imageIcon.getImage();
    }

    public Image getImage() {
        return image;
    }
}
