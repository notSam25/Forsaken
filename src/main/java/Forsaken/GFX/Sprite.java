package Forsaken.GFX;

import java.awt.*;
import javax.swing.ImageIcon;

public class Sprite {
    // X, Y, Width, Height
    public Rectangle transform;
    public Image image;
    public ImageIcon imageIcon;

    public Sprite() {}
    public Sprite(Rectangle _pos, ImageIcon imageIcon) {
        this.transform = _pos;
        setImage(imageIcon);
    }

    public void setImage(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
        this.image = imageIcon.getImage();
    }

    public Image getImage() {
        return this.image;
    }
    public ImageIcon getImageIcon(){ return this.imageIcon; }
}
