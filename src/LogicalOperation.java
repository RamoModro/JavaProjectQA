public class LogicalOperation {

    public String printFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else if (!text.equals("FastTrack")) {
            return ("Got to try some more");
        }
        return text;
    }

    public int printNumber(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        } else {
            return 0;
        }
    }

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String textAndnumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return number + text;
        } else return "No result";
    }

    public String snowForecast(int y) {
        if (y > 8 || y == 6) {
            return "The amount of snow this winter was:" + y + "cm";
        } else return "The forecast snow is" + y + "cm";
    }

    public String howIsNumber(int x) {
        if (x == 4) {
            return "The number is equal to 4";
        } else if (x < 3) {
            return "The number is lower than 3";
        } else if (x > 3 || x != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else return null;
    }


        int number = 2; {
        switch (number) {
            case 1:
                System.out.println("The number is: 1 !");
                break;
            case 2:
                System.out.println("The number is: 2 !");
                break;
            case 3:
                System.out.println("The number is: 3!");
                break;
        }
    }


    public boolean isNumberEven(int z) {
        if (z % 2 == 0) {
            return true;
        } else if (z % 2 != 0) {

        }
        return false;
    }

    public boolean isEligibleToVote(int age) {
        if (age>18){
            return true;
        }else
        return false;
    }

    public int returnBiggestNo(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }else if(b>c){
            return b;
        }else
        return c;
    }
}










