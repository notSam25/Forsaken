package Forsaken.Levels;

import Forsaken.GFX.Object;
import Forsaken.GFX.Render;

import Forsaken.GFX.UIButton;

import Forsaken.GameState;
import Forsaken.Global;

import java.awt.*;

public class StartScreen implements GameState {
    private final UIButton uiButton = new UIButton(new Rectangle(0, 0, Global.tileSize, Global.tileSize));

    @Override
    public void initialize() {

    }

    @Override
    public void update() {
        if (uiButton.isPressed()) {
            System.out.println("Button has been pressed");
        }
    }

    @Override
    public void render() {
        uiButton.render();
        Render.objects.add(new Object(Object.ObjetType.RECT, uiButton.getBounds(), Color.BLUE));
    }
}
