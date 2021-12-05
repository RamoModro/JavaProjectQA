import java.util.Scanner;


public class Lab7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Scanner scan = new Scanner(System.in);
        ReadFromKeyboard read = new ReadFromKeyboard();
        LogicalOperation op = new LogicalOperation();

        //Tema Lab15 Try-Catch

        //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.
        //int x = read.getInt();
        //System.out.println("The number is: " + x);


        //    2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
        //    care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)
        //double d = read.getDouble();
        //float f = read.getFloat();
        //long l = read.getLong();
        //System.out.println("The double type number is:" + d);
        //System.out.println("The float type number is: " + f);
        //System.out.println("The Long type number is:"+l);


        //float a = scan.nextFloat();
        //String z = read.getString();
        //System.out.println("String citit este: " + z);
        // System.out.println("Float-ul citit este: " + a);



        //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
        // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
        //int[] array = read.getArray(3);
        //op.printArray(array);

//  4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
//  Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.(Hint: a se citi de la
//  tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
        //read.getList();

//5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
// Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
// iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul:
// "Inside catch, number too large".
        op.getValueOnGivenIndex(7);

}}



