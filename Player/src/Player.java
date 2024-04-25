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
        System.out.println("\nYour current stats are :");
        getHealth();System.out.println("\n");getFear();System.out.println("\n");getHunger();System.out.println("\n");getLove();System.out.println("\n");getMoney();System.out.println("\n");
        System.out.println("\n");
    }

}