package Forsaken.GFX;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class UIString extends UIObject {
    
    public UIString(Geometry stringObject, ImageIcon imageIcon) {
        object = stringObject;
        if(imageIcon != null)
            sprite = new Sprite(object.position, imageIcon);
    };
    
    @Override
    public void render() {
        if(sprite.image != null)
            Render.sprites.add(sprite);
        
        Render.objects.add(object);
    }

    @Override
    public Rectangle getBounds() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setPosition(Rectangle position) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isPressed() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isDown() {
        // TODO Auto-generated method stub
        return false;
    }
    
    private final Geometry object;
    private Sprite sprite = new Sprite();
}
