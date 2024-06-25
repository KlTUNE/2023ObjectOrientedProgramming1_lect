package jp.ac.ait.k22121;

public class Equipment {
    private String name;
    public Equipment(){
        name = "装備";
    }
    public Equipment(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
}
