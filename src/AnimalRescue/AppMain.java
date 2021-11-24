package AnimalRescue;

public class AppMain {


    public static void main(String[] args) {

        BritishShorthair cat1= new BritishShorthair();
        Food food = new Food();
        RelaxActivity rlx = new RelaxActivity();
        Veterinary vet1 = new Veterinary();
        Bulldog dog1 = new Bulldog();
        Girl girl1 = new Girl();
        Boy boy1 = new Boy();


        girl1.caresForAnimals();
        cat1.play();

        dog1.setName("Toto");
        dog1.getName();

        dog1.setAge((byte) 4);
        dog1.getAge();

        dog1.setHealth((byte) 10);
        dog1.getHealth();

        dog1.setHunger((byte) 6);
        dog1.getHunger();

        dog1.setMood((byte) 9);
        dog1.getMood();

        dog1.setFavFood("Meatballs");
        dog1.getFavFood();

        dog1.setFavRelax("Playing fetch");
        dog1.getFavRelax();



        cat1.setName("Tina");
        cat1.getName();
        System.out.println("Cat name is:"+cat1.getName());
        cat1.purr();
        dog1.wavingTail();
        cat1.speak();
        vet1.caresForAnimals();



        System.out.println("Dog name is:"+dog1.getName());
        System.out.println("Dog age is:"+dog1.getAge());
        System.out.println("Dog health is:"+dog1.getHealth());
        System.out.println("Dog favourite activity is:"+dog1.getFavRelax());
        System.out.println("Dog favourite food is:"+dog1.getFavFood());
        System.out.println("Dog mood is:"+dog1.getMood());
        dog1.play();

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
        vet1.getSpecialization();

       // System.out.println("Veterinary name is:"+vet.getName());
       // System.out.println("Veterinary specialization is:"+vet.getSpecialization());

    }
}
