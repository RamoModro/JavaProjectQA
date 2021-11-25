package AnimalRescue;

public abstract class Human {

    private String name;
    private String gender;
    private byte age;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public abstract void caringAboutAnimals();
}
