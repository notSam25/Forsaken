package Forsaken;

public class Main implements Runnable {
    public static void main(String[] args) {

        System.out.println("Welcome to Forsaken!");

        // Set the starting gameState
        Global.setGameState(Global.GameStates.STARTMENU);

        // Start our runnable instance
        new Thread(new Main()).start();

        // Init the window for drawing our game
        Global.window.initWindow();
    }

    @Override
    public void run() {
        try {
            Global.window.gameLoop();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}