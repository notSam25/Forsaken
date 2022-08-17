package Forsaken;

import Forsaken.GFX.Window;
import Forsaken.Levels.StartScreen;

import java.awt.*;

public class Global {

    // Window vars
    public static final String windowName = "Forsaken";
    public static Window window = new Window();
    public static final Dimension screenResolution = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int tileScale = 3;
    private static final int tileSize = 16 * tileScale;
    private static final int maxScreenCol = 18;
    private static final int maxScreenRow = 12;
    public static final int screenWidth = maxScreenCol * tileSize;
    public static final int screenHeight = maxScreenRow * tileSize;

    // Render vars
    public static final int targetTPS = 60;

    // Level data
    protected static StartScreen startScreen = new StartScreen();
    public static GameState gameState = startScreen;
    public static boolean closeGame = false;

}
