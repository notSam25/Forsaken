package Forsaken.Levels;

import Forsaken.GFX.Render;
import Forsaken.GFX.Sprite;
import Forsaken.GFX.UIButton;
import Forsaken.GameState;
import Forsaken.Global;

import javax.swing.*;
import java.awt.*;

public class StartScreen implements GameState {
    private final Sprite button_1 = new Sprite(new Rectangle(0, 0, 0, 0), new ImageIcon("src/main/resources/button_1.png"));
    private final Sprite button_play = new Sprite(new Rectangle(0, 0, 0, 0), new ImageIcon("src/main/resources/button_play.png"));
    private final UIButton uiButton = new UIButton(new Rectangle(Global.screenWidth / 2, Global.screenHeight / 2, Global.tileSize, Global.tileSize));

    @Override
    public void initialize() {

    }

    @Override
    public void update() {
        if(uiButton.isPressed()) {
            System.out.println("Button has been pressed");
        }
    }

    @Override
    public void render() {
//        Render.sprites.add(new Sprite(new Rectangle(Global.screenWidth / 2 + Global.tileSize, Global.screenHeight / 2, -Global.tileSize, Global.tileSize), button_1.getImageIcon()));
//        Render.sprites.add(new Sprite(new Rectangle(Global.screenWidth / 2 - Global.tileSize, Global.screenHeight / 2, Global.tileSize, Global.tileSize), button_1.getImageIcon()));
//        Render.sprites.add(new Sprite(new Rectangle(Global.screenWidth / 2 - (Global.tileSize / 2), Global.screenHeight / 2, Global.tileSize, Global.tileSize), button_play.getImageIcon()));
        uiButton.render();
    }
}
