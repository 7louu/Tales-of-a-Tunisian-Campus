abstract class sideCharacter{
    public String name;
    public sideCharacter(String name)
    {
        this.name = name;
    }
}
class firstSide extends sideCharacter{
    private int friendship;
    private int sarcasm;
    public firstSide(int friendship,int sarcasm){
        super("Jari");
        this.friendship = friendship;
        this.sarcasm = sarcasm;
    }

    public int getFriendship() {
        return friendship;
    }

    public int getSarcasm() {
        return sarcasm;
    }
}
class secondSide extends sideCharacter{
    private int love;
    private int hate;
    public secondSide()
    {
        super("El_Moujira");
        this.hate = 0;
        this.love = 90;
    }

    public int getLove() {
        return love;
    }
    public int getHate(){
        return hate;
    }
}
class thirdSide extends sideCharacter{
    private int power;
    public thirdSide()
    {
        super("El_3dou");
        this.power = 60;
    }
    public int getPower()
    {
        return power;
    }
}