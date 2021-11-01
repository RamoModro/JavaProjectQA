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

    public int checkBiggerNumber(int first, int second){
        if (first>second){
            return first;
        }else{
            return second;
        }
    }

    public String textAndnumber(String text, int number){
        if(text.equals("FastTrackIT") && number<=3){
           return text + number;
        }else if(!text.equals("FastTrackIT") && number >=4){
            return number+text;
        }else return "No result";

    }


}

