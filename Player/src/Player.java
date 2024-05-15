import java.util.Scanner;

public class Player{
    private int money;
    private int health;
    private int love;
    private int hunger;
    private int fear;
    public Player()
    {
        this.money = 10;
        this.fear = 0;
        this.health = 100;
        this.love = 25;
        this.hunger = 20;
    }

    public int getFear() {
        return fear;
    }

    public int getHealth() {
        return health;
    }

    public int getHunger() {
        return hunger;
    }

    public int getLove() {
        return love;
    }

    public int getMoney() {
        return money;
    }

    public void setFear(int fear) {
        this.fear = fear;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void checkStats()
    {
        System.out.println("\nYour current stats are:");
        System.out.println("Health: " + getHealth());
        System.out.println("Fear: " + getFear());
        System.out.println("Hunger: " + getHunger());
        System.out.println("Love: " + getLove());
        System.out.println("Money: " + getMoney());
        System.out.println("\nPress any key to return to the main menu...");
        waitForAnyKey();
    }
    private void waitForAnyKey()
    {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        while(!game.isGameOver()){
            game.displayOptions();
            game.handlePlayerInput();
        }

    }


}