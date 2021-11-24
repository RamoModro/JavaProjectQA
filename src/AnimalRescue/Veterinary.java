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
        public void caresForAnimals() {
                System.out.println("Treating animal at the cabinet");
        }
}
