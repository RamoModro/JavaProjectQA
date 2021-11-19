public class Lab5 {

    public static void main(String[] args) {
        //Define and write the values of an array indices,
        //so that the values of the arrays should start from
        //1 and count to 100;

        LogicalOperation op = new LogicalOperation();

        //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
        // Sa se afiseze progresul in consola pe tot parcursul.
        //int[] myArr = op.populateArray(100);
        int[] myArr = new int[100];
        op.printArray(myArr);


        //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
        // si sa il returneze populat cu toate valorile pare de la 1 la 100.
        // Apelati metoda in main() pentru a verifica daca functioneaza.
        // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
        int[] array = op.populateArray(100);
        op.getEvenNrArray(array);

        //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
        // Metoda sa calculeze si sa returneze media numerelor din array.
        int[] array3= op.populateArray(50);
        System.out.println(op.getAverageValueFromArray(array3));

        //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
        //si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul
        // primit, iar daca da sa returneze true iar daca nu, sa returneze false.
        String[]sir = {"dog", "cat", "mouse"};
        System.out.println(op.isWordInArray(sir,"mouse"));

        //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
        // si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
        // si daca da, atunci sa returneze pozitia pe care se afla numarul.
        int[] array4 = new int[5];
        array4[0] = 22;
        array4[1] = -7;
        array4[2] = 100;
        array4[3] = 345;
        array4[4] = 5;
        op.getNumberPositionInArray(array4,-7);

        //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
        //
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        //
        //- - - - - - - - - -
        String[] arraySir = {"- - - - - - - - - -"};
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);
        op.printPattern(arraySir);

        //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
        // si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da,
        // sa returneze array-ul primit, fara acel numar.
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        op.skipNumber(arr1,5);

        //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
        int[] arr = {12, 17, 15, 19, 3};
        System.out.println("Second smallest is:"+op.getSecondSmallest(arr,5));

        //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
        // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = new int[arr2.length];
        op.copyArray(arr2,arr3);

    }
}




