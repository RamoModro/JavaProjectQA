public class Calculator{


    public int sum(int first, int second){
        int result = first+second;
        return result;
    }

    public float sum(float first, float second){
        float result = first+second;
        return result;
    }

    public float sum(float first, float second, float third){
        float result = first+second+third;
        return  result;
    }

    public int sum(int a, int b, int c, int d){
        int result = a+b+c+d;
        return  result;
    }

    public double substraction(int first, double second){
        double result = first - second;
        return result;
    }

    public float substraction(float first, float second){
        float result = first - second;
        return result;
    }

    public int substraction(int first, int second){
        int result = first - second;
        return result;
    }

    public double multiply(int first, double second){
        double result = first * second;
        return result;
    }

    public double multiply(int first, int second, int third) {
        int result = first * second * third;
        return result;
    }

        public float multiply(float first, float second){
            float result = first * second;
            return result;
        }

    public double divide(int first, double second){
        double result = first / second;
        return result;
    }

    public float divide(float first, double second) {
        float result = (float) (first / second);
        return result;
    }

    public double modulo(int first, double second){
        double result = first % second;
        return result;
    }

    public int modulo(int first, int second){
        int result = first % second;
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


