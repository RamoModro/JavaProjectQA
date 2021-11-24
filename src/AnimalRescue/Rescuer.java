package AnimalRescue;

public abstract class Rescuer extends Human {

    private double money;


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public abstract void caresForAnimals();

}