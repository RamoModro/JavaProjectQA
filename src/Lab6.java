import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        LogicalOperation op = new LogicalOperation();
        List<Integer> mySecondList = op.getPopulatedList(30);
        List<String> myStringList = new ArrayList<>();

        myStringList.add("monday");
        myStringList.add("tuesday");
        myStringList.add("wednesday");
        myStringList.add("thursday");
        myStringList.add("saturday");
        myStringList.add("sunday");
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(3));
//        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);

        //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze,
        // pe rand, toate valorile din lista, fiecare pe rand nou.
        op.printList(mySecondList);

        //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
        // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.
        op.addNumberAtTheEndOfList(mySecondList,20);

        //3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
        // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
        // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
        op.printListFromNumber(mySecondList, 55);

//  4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
//  dar invers(de la capat la inceput).
        op.printListFromEnd(mySecondList);

//  5.Scrieti o metoda Java, care sa primeasca trei parametri: unul de tip Lista de String-uri,
//  unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
//  iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
        op.setStringPosition(myStringList,4,"friday");

//  6.Scrieti o metoda Java, care sa primeasca doi parametrii.
//  Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
        op.setFirstPosition(mySecondList, 100);

//  7.Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.
//  (Ex: “Pe pozitia 1 valoarea este 4”).
        op.getIndexAndValue(mySecondList);

//  8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
        op.getHighestNumber(mySecondList);



    }
}
