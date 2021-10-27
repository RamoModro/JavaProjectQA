public class Lab2 {
    public static int x = 2;
    public static int y = 3;
    public static int z = 5;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Print printing = new Print();

        double sumresult = calc.sum(x,y);
        double substractresult = calc.substraction(x,y);
        double multiplyresult = calc.multiply(x,y);
        double divisionresult = calc.divide(x,y);
        double moduloresult = calc.modulo(x,y);
        //System.out.println(sumresult);
        //System.out.println(substractresult);
       // System.out.println(multiplyresult);
        //System.out.println(divisionresult);
        //System.out.println(moduloresult);

        printing.printMyName();

        printing.printJava();

        double mediaresult = calc.media(x,y,z);
        System.out.println(mediaresult);

        printing.printFaceModel();

        }

    }


