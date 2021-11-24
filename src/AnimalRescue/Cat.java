package AnimalRescue;

public abstract class Cat extends Animal{

    public void purr(){
        System.out.println("rrrrr");
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {

    }

    public abstract void play();

    public void speak(){
        System.out.println("Meow");
    }
}
