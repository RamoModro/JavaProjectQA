package AnimalRescue;

public class Animal {
    private byte age;
   private String name;
   private byte health;
   private byte hunger;
   private byte mood;
   private String favFood;
   private String favRelax;

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

    public byte getHunger(){
        return hunger;
    }

    public void setHunger(byte hunger){
        this.hunger =  hunger;
    }

    public byte getMood() {
        return mood;
    }

    public void setMood(byte mood){
        this.mood = mood;
    }

    public String getFavFood(){
        return favFood;
    }

    public void setFavFood(String food){
        this.favFood = food;
    }

    public String getFavRelax(){
        return favRelax;
    }

    public void setFavRelax(String relax){
        this.favRelax = relax;
    }


    public void eat(){

        System.out.println("Eating...");
    }

    public void sleep(){

        System.out.println("zzZZz..(snoring)");
    }

    public void play(){
        System.out.println("Playing...");
    }


}
