package bscity;

import java.util.Scanner;

public class Game {
    private boolean isRunning;
    private Player player;
    private Scanner scanner;

    public Game() {
        player = new Player();
        scanner = new Scanner(System.in);
    }

    public void start() {
        isRunning = true;
        // Start de game loop
        while(isRunning) {
            update();
            render();
            try {
                Thread.sleep(100); // 10 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        System.out.println("You have: $" + player.getMoney());
        System.out.println("What would you like to do?");
        System.out.println("1. Build House ($100)");
        System.out.println("2. Build Factory ($500)");
        System.out.println("3. Collect Income");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                player.buyBuilding(new House());
                break;
            case 2:
                player.buyBuilding(new Factory());
                break;
            case 3:
                player.collectIncome();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private void render() {
        // Deze methode kun je uitbreiden voor meer geavanceerde rendering
    }
}

