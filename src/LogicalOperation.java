public class LogicalOperation {

    public String printFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else if (!text.equals("FastTrack")) {
            return ("Got to try some more");
        }
        return text;
    }

    public void printNumber(int number) {
        if (number >= 2 && number <= 8) {
            System.out.println(number);
            ;
        } else {
            return ;
        }

    }
}

