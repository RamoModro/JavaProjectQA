package AnimalRescue;

public class PetFood {
    private String name;
    private double price;
    private int quantity;
    private String availability;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public String getAvailability(){
        return availability;
    }
    public void setAvailability(String availability){
        this.availability=availability;
    }
}
