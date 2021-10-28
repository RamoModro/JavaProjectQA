public class Lab2 {
    public static int x = 2;
    public static int y = 3;
    public static int z = 5;
    public static int F = 100 ;
    public static int inch = 1350;

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

        printing.printMyName();

        printing.printJava();

        double mediaresult = calc.media(x,y,z);
        System.out.println("Media = " + mediaresult);

        printing.printFaceModel();

        System.out.println("Restul impartirii = " + moduloresult);

        int celsiusTemp = calc.celsiusTemp(F);
        System.out.println("Temperatura in grade C este:" + celsiusTemp);

        double distMeters = calc.distance(inch);
        System.out.println("Distanta = " + distMeters);

        float timpSecunde;
        float mps,kmph,mlph;
        float ora = 1;
        float minut = 58;
        float secunda = 35;
        float distanta = 2345;
        timpSecunde = (ora*3600) + (minut*60) + secunda;
        mps = distanta / timpSecunde;
        kmph = (distanta/1000.0f) / (timpSecunde/3600.0f);
        mlph = kmph / 1.609f;
        System.out.println("Viteza in mps = " + mps);
        System.out.println("Viteza in kmps = " + kmph);
        System.out.println("Viteza in mlph = " + mlph);
        }



    }


