package Forsaken;

import Forsaken.GFX.Window;
import Forsaken.Levels.StartScreen;

public class Global {

    // Window vars
    public static final String windowName = "Forsaken";
    public static Window window = new Window();

    // Level data
    protected static StartScreen startScreen = new StartScreen();
    public static GameState gameState = startScreen;
}
