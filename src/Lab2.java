public class Lab2{
    public static int x = 2;
    public static int y = 3;
    public static int z = 5;
    public static int F = 100 ;
    public static int inch = 1350;



    public static void main(String[] args) {

       // int[] value = {125,635};
       // System.out.println("before display array meth first element of value array = "+value[0]);
        //displayArray(value);
       // System.out.println("after display array meth first element of value array = "+value[0]);

        Calculator calc = new Calculator();
        Print printing = new Print();
        Speedcalc viteza = new Speedcalc();


        System.out.println(calc.sum(22.3f,23.4f));
        System.out.println(calc.sum(23,5,67,10));
        //System.out.println(substractresult);
        // System.out.println(multiplyresult);
        //System.out.println(divisionresult);

        //printing.printMyName("Ramona");
        //String name = new String("TestNume");
        //printing.printMyName(name);


        //printing.printJava();

        //double mediaresult = calc.media(x, y, z);
        //System.out.println("Media = " + mediaresult);

       // printing.printFaceModel();

        //double moduloresult = calc.modulo(x,y);
        //System.out.println("Restul impartirii = " + moduloresult);

        //int celsiusTemp = calc.celsiusTemp(F);
       // System.out.println("Temperatura in grade C este:" + celsiusTemp);

        //double distMeters = calc.distance(inch);
       // System.out.println("Distanta = " + distMeters);

        //viteza.mps();
    }

        //public static void doStuff(int y){
        //System.out.println("afiseaza metoda y = " + y);
    }

        //public static void displayArray(int[] values){
            //System.out.println("Inside displayArray method first element is = " + values[0]);
            //values[0] = 100;
            //System.out.println("Inside displayArray method first element is = " + values[0]);








