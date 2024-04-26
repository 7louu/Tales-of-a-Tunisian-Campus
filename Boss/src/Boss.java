abstract class Boss{
    public int anger;
    public String name;
    public int power;
    public Boss(String name, int anger, int power)
    {
        this.name = name;
        this.anger = anger;
        this.power = power;
    }
}
class firstBoss extends Boss {

    public firstBoss() {
        super("El_7nach",10,20);
    }
    private void increaseAnger()
    {
        this.anger++;
    }
    private void decreaseAnger()
    {
        this.anger--;
    }
    private void increasePower()
    {
        this.power++;
    }
    private void decreasePower()
    {
        this.power--;
    }
}
class secondBoss extends Boss{
    public secondBoss(){
        super("El_Algo_Master",70,100);
    }
    private void increaseAnger()
    {
        this.anger++;
    }
    private void decreaseAnger()
    {
        this.anger--;
    }
    private void increasePower()
    {
        this.power++;
    }
    private void decreasePower()
    {
        this.power--;
    }
}