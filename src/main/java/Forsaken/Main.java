package Forsaken;

public class Main implements Runnable {
    public static void main(String[] args) {

        System.out.println("Welcome to Forsaken!");

        // Start our runnable instance
        new Thread(new Main()).start();

        // Init the window for drawing our game
        Global.window.initWindow();
    }

    @Override
    public void run() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}