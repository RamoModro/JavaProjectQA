package AnimalRescue;

public abstract class Dog extends Animal{

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    public void speak(){
        System.out.println("Bark");
    }

    public abstract void wavingTail();

    public abstract void play();
}
