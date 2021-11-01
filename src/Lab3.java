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
    }
}
