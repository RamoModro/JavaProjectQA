package AnimalRescue;

public class Rescuer {
        private String name;
        private String gender;
        private byte age;
        private double money;

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

        public double getMoney() {
                return money;
        }

        public void setMoney(double money) {
                this.money = money;
        }
}
