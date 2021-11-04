package AnimalRescue;

public class Pet {
    byte age;
    String name;
    byte health;
    byte hunger;
    byte mood;
    String favFood;
    String favRelax;

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("zzZZz..(snoring)");
    }

    public void play(){System.out.println("Playing...");
    }

}
