package AnimalRescue;

public class AppMain {


    public static void main(String[] args) {

        Animal dog = new Animal();
        Cat cat1= new Cat();
        Dog dog1 = new Dog();
        Food food = new Food();
        RelaxActivity rlx = new RelaxActivity();
        Rescuer human = new Rescuer();
        Veterinary vet = new Veterinary();
        Bulldog englishBulldog = new Bulldog();
        Girl girl1 = new Girl();


        //dog.setName("Toto");
        //dog.getName();

        //dog.setAge((byte) 4);
        //dog.getAge();

        //dog.setHealth((byte) 10);
        //dog.getHealth();

        //dog.setHunger((byte) 6);
        //dog.getHunger();

        //dog.setMood((byte) 9);
       // dog.getMood();

        //dog.setFavFood("Meatballs");
       // dog.getFavFood();

        //dog.setFavRelax("Playing fetch");
        //dog.getFavRelax();



        cat1.setName("Tina");
        cat1.getName();
        System.out.println("Cat name is:"+cat1.getName());
        cat1.purr();
        dog1.wavingTail();
        cat1.speak();
        vet.caresForAnimals();



        //System.out.println("Dog name is:"+dog.getName());
       // System.out.println("Dog age is:"+dog.getAge());
       // System.out.println("Dog health is:"+dog.getHealth());
        //System.out.println("Dog favourite activity is:"+dog.getFavRelax());
       // System.out.println("Dog favourite food is:"+dog.getFavFood());
        //System.out.println("Dog mood is:"+dog.getMood());
        dog.play();

        //food.setName("Biscuit");
        //food.getName();

        //food.setPrice(10);
        //food.getPrice();

        //food.setQuantity(1);
        //food.getQuantity();

        //food.setAvailability("Available");
        //food.getAvailability();

        //System.out.println("Available food:"+food.getName());
        //System.out.println("Food price is:"+food.getPrice()+"ron");
        //System.out.println("Food quantity:"+food.getQuantity());
        //System.out.println("Food is:"+food.getAvailability());

        //rlx.setName("chasing cats");
        //rlx.getName();

        //System.out.println(dog.getName()+" "+"likes"+" "+rlx.getName());

        //human.setName("Andy");
        //human.getName();

        //human.setGender("M");
        //human.getGender();

        //human.setAge((byte) 18);
       // human.getAge();

        //human.setMoney(1000);
       // human.getMoney();

       // System.out.println(dog.getName()+" "+"s rescuer name is:"+" "+human.getName());
        //System.out.println(human.getName()+" "+"age is:"+human.getAge());
       // System.out.println(human.getName()+" "+"has"+" "+human.getMoney()+" "+"ron"+" "+"to buy a pet");

       // vet.setName("Denis");
       // vet.getName();

       // vet.setSpecialization("Dermathology");
        vet.getSpecialization();

       // System.out.println("Veterinary name is:"+vet.getName());
       // System.out.println("Veterinary specialization is:"+vet.getSpecialization());

    }
}
