package AnimalRescue;

public class Rescuer extends Human {

    private double money;


    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void caresForAnimals() {
        super.caresForAnimals();
        System.out.println("Takes animal home");
    }
}
