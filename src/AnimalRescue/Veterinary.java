package AnimalRescue;

public class Veterinary extends Human {

        private String specialization;


        public String getSpecialization() {
                return specialization;
        }

        public void setSpecialization(String specialization) {
                this.specialization = specialization;
        }

        @Override
        public void caringAboutAnimals() {
                System.out.println("Consulting animal at the cabinet");
        }
}
