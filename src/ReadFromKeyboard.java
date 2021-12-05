import java.util.*;

public class ReadFromKeyboard {


    //ex 1
    public int getInt() {
        int count = 0;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Insert a number: ");
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_OPTION);
                count++;
            }
            if (count == 5) {
                sleep(5);
                count = 0;
            }
        } while (true);
    }

    private void sleep(int seconds) {
        System.out.print("Sleeping for: ");
        do {
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds--;
        } while (seconds > 0);

    }

    //ex 2

    public double getDouble() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Insert a Double type number: ");
                return scan.nextDouble();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_OPTION);
            }
        } while (true);
    }

    public float getFloat() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Insert a Float type number: ");
                return scan.nextFloat();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_OPTION);
            }
        } while (true);
    }

    public long getLong() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Insert a Long type number: ");
                return scan.nextLong();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_OPTION);
            }
        } while (true);
    }

    public String getString() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Insert a String: ");
                return scan.next();
            } catch (InputMismatchException error) {
                System.out.println(Messages.INCORRECT_OPTION);
            }
        } while (true);
    }

    //ex 3
    public int[] getArray(int size) {
        int[] myArr = new int[size];
        System.out.println("Insert values from array.");
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = getInt();
        }
        return myArr;
    }


    //ex 4
    public List<Integer> getList() {
        List<Integer> myList = new ArrayList<>();
        System.out.print("Insert a value in the List: ");
        do {
            Scanner scan = new Scanner(System.in);
            try {
                for (int i = 0; i <= myList.size(); i++) {
                    myList.add(i, scan.nextInt());
                    System.out.println(myList);
                }
            } catch (Exception e) {
                System.out.println("Program stopped");
            }
        } while (!true) ;
        return myList;
    }
    }

