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

    public String snowForecast(int y){
        if(y>8 && y==6){
            return "The amount of snow this winter was:" + y+ "cm";
        }else return "The forecast snow is"+ y+ "cm";
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
}






