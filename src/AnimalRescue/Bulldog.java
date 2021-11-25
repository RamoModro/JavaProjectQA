package AnimalRescue;

public class Bulldog extends Dog{


    @Override
    public void wavingTail() {
        System.out.println("Shaking his body");

    }

    @Override
    public void play() {
        System.out.println("Chasing cats");
    }

    @Override
    public void sleep() {
        System.out.println("Snoring");
    }

    @Override
    public void eat() {
        System.out.println("Eating dry food");
    }
}
