package jp.ac.ait.k22121;

public class Weapon extends Equipment{
    private int atk;
    public Weapon(){
        super("装備");
        atk = 0;
    }
    public Weapon(String name, int atk){
        super(name);
        this.atk = atk;
    }
    public int getAtk(){
        return  atk;
    }
    public void setAtk(int atk){
        this.atk = atk;
    }
}
