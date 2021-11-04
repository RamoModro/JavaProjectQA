package AnimalRescue;

public class AppMain {


    public static void main(String[] args) {

        Pet dog = new Pet();
        PetFood food = new PetFood();
        RelaxActivity rlx = new RelaxActivity();
        Rescuer human = new Rescuer();
        Veterinary vet = new Veterinary();

        dog.name = "Bazil";
        dog.age = 3;
        dog.health = 10;
        dog.hunger = 5;
        dog.mood = 7;
        dog.favFood = "Meatballs";
        dog.favRelax = "Playing fetch";
        System.out.println(dog.name);
        System.out.println(dog.age);
        dog.play();

        food.name = "meatballs";
        food.quantity = 400;
        food.availability = "Available";
        food.price = 15;
        System.out.println(food.name);
        System.out.println(food.quantity + "gr");

        rlx.name = "Running";
        System.out.println(rlx.name);

        human.gender = "M";
        human.age = 30;
        human.money = 500;
        System.out.println(human.money+ "Euro");

        vet.name = "Alec";
        vet.specialization = "Dermathology";
        System.out.println(vet.name);
        System.out.println(vet.specialization);

    }
}
