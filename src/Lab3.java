public class Lab3 {

    public static void main(String[] args) {


    LogicalOperation op = new LogicalOperation();

//  3.In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
//  si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode care
//  numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
            int biggest = op.checkBiggerNumber(56,836);
            //System.out.println("The biggest number is:" + biggest);


//  4.Given a text input,if it is“FastTrack”,then print “Learning text comparison”.If not, print“Got to try some more”
            String text = "Fast";
            //System.out.println(op.printFastTrack(text));


//  5.Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
//  Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru
//  este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
//  Daca textul nu este“FastTrackIT”si numarul este mai mare sau egal cu 4,returnati numarul si textul,in ordinea asta.
            //System.out.println(op.textAndnumber("FastTrack", 4));


//  Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
            //System.out.println(op.printNumber(9));


//  6. Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8,
//  SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze
//  “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.
        System.out.println(op.snowForecast(10));

//  7.Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
//  Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
//  Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati
//  “The number is lower than 3”.
        System.out.println(op.howIsNumber(8));


    }



}
