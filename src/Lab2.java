public class Lab2 {
    public static int x = 2;
    public static int y = 3;

    public static void main(String[] args) {
        double sumresult = sum(x,y);
        double substractresult = substraction(x,y);
        double multiplyresult = multiply(x,y);
        double divisionresult = divide(x,y);
        double moduloresult = modulo(x,y);
        System.out.println(sumresult);
        System.out.println(substractresult);
        System.out.println(multiplyresult);
        System.out.println(divisionresult);
        System.out.println(moduloresult);
;    }

    public static double sum(int first, double second){
        double result = first+second;
        return result;
    }

    public static double substraction(int first, double second){
        double result = first - second;
        return result;
    }

   public static double multiply(int first, double second){
        double result = first * second;
        return result;
   }

   public static double divide(int first, double second){
        double result = first / second;
        return result;
   }

   public static double modulo(int first, double second){
        double result = first % second;
        return result;
   }

}
