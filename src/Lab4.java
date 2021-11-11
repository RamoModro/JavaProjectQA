public class Lab4 {

    public static void main(String[] args) {

        LogicalOperation op = new LogicalOperation();

//        op.countBackwards(3, 100);

//        Write a program called SumAndAverage to
//        produce the sum of 1, 2, 3, ..., to 100.
//        Also compute and display the average.
//        System.out.println(op.getAverageFromInterval(1, 100));

//        Write a program to sum those numbers from 1 to 100 that is
//        divisible by 7, and compute the average.
//        System.out.println(op.getAverageDivisibleBySeven(1,100));


        //TEMA JAVA FOR LOOPS:

        //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
        // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
        // deoarece metoda afiseaza, nu returneaza.
        op.verifyNo(55);

        //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,pornind de la
        // numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
        op.negativeNo(0);

        //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
        // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
        // numaratoarea sa se faca de la x, la y.
        op.countBetweenTwoNumbers(123,200);

        //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
        // o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru
        // iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
        op.countStartSmallestNo(65,50);

        //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
        op.getEvenNumbers(1,100);

        //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
        op.getUnevenNumbers(1,100);

        //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
        // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
        // iar la final sa returneze rezultatul.
        System.out.println(op.sumToHundred(99));

        //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
        // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
        // si sa calculeze media numerelor. La final, metoda sa returneze media.
        System.out.println(op.getAverageToHundred(92));

        //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
        //*******
        //
        //******
        //
        //*****
        //
        //****
        //
        //***
        //
        //**
        //
        //*
        op.printStars(7);

    }
}
