package AnimalRescue;

public class AppMain {


    public static void main(String[] args) {

        Pet dog = new Pet();
        PetFood food = new PetFood();
        RelaxActivity rlx = new RelaxActivity();
        Rescuer human = new Rescuer();
        Veterinary vet = new Veterinary();

        dog.setName("Toto");
        String name = dog.getName();

        dog.setAge((byte) 4);

        dog.setHealth((byte) 10);
        dog.getHealth();

        dog.setHunger((byte) 6);
        dog.getHunger();

        dog.setMood((byte) 9);
        dog.getMood();

        dog.setFavFood("Meatballs");
        dog.getFavFood();

        dog.setFavRelax("Playing fetch");
        dog.getFavRelax();

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getHealth());
        System.out.println(dog.getFavRelax());
        System.out.println(dog.getMood());
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
