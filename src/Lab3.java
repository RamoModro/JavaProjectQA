public class Lab3 {

    public static void main(String[] args) {


    LogicalOperation op = new LogicalOperation();


    //2.Given a text input, if it is “FastTrack”, then print “Learning text comparison”.
        // If not, print “Got to try some more”

        String text = "FastTrackit";
        System.out.println(op.printFastTrack(text));

    //3.Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
        int number = 10;
        op.printNumber(number);

        int biggest = op.checkBiggerNumber(4567,836);
        System.out.println("The biggest number is:" + biggest);

     //5. Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
        // Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru
        // este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
        // Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4, returnati numarul si textul,
        // in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.

        System.out.println(op.textAndnumber("FastTrackIT", 2));



    }






}
