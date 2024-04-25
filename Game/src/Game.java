import java.io.*;
import java.util.Scanner;
public class Game{
    private boolean gameOver;
    private Player player;
    private Scanner scanner;
    public Game()
    {
        this.gameOver = false;
        this.player = new Player();
        this.scanner = new Scanner(System.in);
    }
    private void displayOptions()
    {
        System.out.println("Main Menu:");
        System.out.println("1. Start Game");
        System.out.println("2. Check Stats");
        System.out.println("3. Save Game");
        System.out.println("4. Load Game");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    private void displayExitOptions(){
        System.out.println("Are you sure you want to leave?");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }
    private void handleExitInput(){
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                gameOver = true;
                System.out.println("See you next time!");
                break;
            case 2:
                break;
        }
    }
    private void handlePlayerInput()
    {
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1 -> startGame();
            case 2 -> player.checkStats();
            case 3 -> saveGame();
            case 4 -> loadGame();
            case 5 -> exitGame();
        }

    }
    public void startGame()
    {
        displayIntroduction();
        while(!gameOver)
        {
            displayOptions();
            handlePlayerInput();
        }
        displayEnding();
    }
    private void displayIntroduction()
    {
        System.out.println("Welcome to the Game !\nReady to survive a day in EPI?");
    }
    private void beginLevel()
    {
        System.out.println("");
        gameOver = true;
    }
    private void displayEnding()
    {
        System.out.println("");
    }
    public void exitGame()
    {
        displayExitOptions();
        handleExitInput();
    }
    public void saveGame()
    {
        try {
            FileOutputStream fileOut = new FileOutputStream("gamestate.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(player);
            out.close();
            fileOut.close();
            System.out.println("Game saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving game: " + e.getMessage());
        }
    }
    public void loadGame()
    {
        try {
            FileInputStream fileIn = new FileInputStream("gamestate.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            player = (Player) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Game loaded Successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading the game: " + e.getMessage());
        }
    }

}