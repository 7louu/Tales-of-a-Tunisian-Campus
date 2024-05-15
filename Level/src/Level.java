import java.util.Scanner;

abstract class Level{
    private int levelNumber;
    private Player player;
    public Level(int levelNumber)
    {
        this.levelNumber = levelNumber;
    }
    public void handlePlayerInput()
    {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
    }
    public void startLevel()
    {
        System.out.println("Level Started!");
        System.out.println("You can exit the game by typing '20' as a choice" );
    }
    public void finishLevel()
    {
        System.out.println("Level Completed successfully!");
    }
}
class firstLevel extends Level{
    private firstBoss B1;

    public firstLevel(firstBoss B1)
    {
        super(1);
        this.B1 = B1;
    }

    @Override
    public void startLevel()
    {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        super.startLevel();
        System.out.println("Level 1 : Python Problems");
        System.out.println("El_7nach : Ayya wini khedmetkom la sbeh lkhir la welou !");
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        firstSide side1 = new firstSide(100,100);
        secondLevel l2 = new secondLevel(side1);
        l2.startLevel();
    }
}
class secondLevel extends Level{
    private firstSide side1;
    public secondLevel(firstSide side1)
    {
        super(2);
        this.side1 = side1;
    }

    @Override
    public void startLevel() {
        super.startLevel();
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        secondSide side2 = new secondSide();
        thirdLevel l3 = new thirdLevel(side2);
        l3.startLevel();
    }
}
class thirdLevel extends Level{
    private secondSide side2;
    public thirdLevel(secondSide side2)
    {
        super(3);
        this.side2 = side2;
    }

    @Override
    public void startLevel() {
        super.startLevel();
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        thirdSide side3 = new thirdSide();
        fourthLevel l4 = new fourthLevel(side3);
        l4.startLevel();
    }
}
class fourthLevel extends Level{
    private thirdSide side3;
    public fourthLevel(thirdSide side3)
    {
        super(4);
        this.side3 = side3;
    }
    @Override
    public void startLevel() {
        super.startLevel();
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        secondBoss finalBoss = new secondBoss();
        fifthLevel l5 = new fifthLevel(finalBoss);
        l5.startLevel();
    }
}
class fifthLevel extends Level{
    private secondBoss B2;
    public fifthLevel(secondBoss B2)
    {
        super(5);
        this.B2 = B2;
    }
    @Override
    public void startLevel() {
        super.startLevel();
    }

    @Override
    public void finishLevel() {
        super.finishLevel();
    }
}

