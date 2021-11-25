package AnimalRescue;

public class BritishShorthair extends Cat{
    @Override
    public void play() {
        System.out.println("Sneaking for mice");
    }
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void purr() {
        super.purr();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
