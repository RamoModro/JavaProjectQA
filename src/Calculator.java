public class Calculator {

    public double sum(int first, double second){
        double result = first+second;
        return result;
    }

    public double substraction(int first, double second){
        double result = first - second;
        return result;
    }

    public double multiply(int first, double second){
        double result = first * second;
        return result;
    }

    public double divide(int first, double second){
        double result = first / second;
        return result;
    }

    public double modulo(int first, double second){
        double result = first % second;
        return result;
    }

    public double media(int first, double second, double third){
        double result = (first * second * third)/3;
        return result;
    }

    public int celsiusTemp(int F){
        int celsiusTemp = (F-32) * 5/9;
        return celsiusTemp;
    }

    public double distance(int inch){
        double distMeters = inch/39.370;
        return distMeters;
    }


    }


