public class LogicalOperation {

    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
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

    public String textNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return number + text;
        } else {
            return "No result";
        }
    }

    public String snowForecast(int y) {
        if (y > 8 || y == 6) {
            return "The amount of snow this winter was:" + y + "cm";
        } else {
            return "The forecast snow is" + y + "cm";
        }
    }

    public String howIsNumber(int x) {
        if (x > 3 && x != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (x == 4) {
            return "The number is equal to 4";
        } else if (x < 3) {
            return "The number is lower than 3";
        }
        return null;
    }

    public void printNum(int number) {

        switch (number) {

            case 0:

                System.out.println("The number is 0");

                break;

            case 1:

                System.out.println("The number is 1");

                break;

            case 2:

                System.out.println("The number is 2");

                break;

            case 3:

                System.out.println("The number is 3");

                break;

            case 4:

                System.out.println("The number is 4");

                break;

            case 5:

                System.out.println("The number is 5");

                break;

            case 6:

                System.out.println("The number is 6");

                break;

            case 7:

                System.out.println("The number is 7");

                break;

            case 8:

                System.out.println("The number is 8");

                break;

            case 9:

                System.out.println("The number is 9");

                break;

            default:

                System.out.println("Not allowed");

        }
    }

    public boolean isNumberEven(int z) {
        if (z % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int returnBiggestNo(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else
            return c;
    }

    public void countBackwards(int small, int big) {
        for (int i = big; i >= small; i--) {
            System.out.println(i);
        }
    }

    public float getAverageFromInterval(int start, int max) {
        float sum = 0;
        for (int i = start; i <= max; i++) {
            sum = i + sum;
        }
        return sum / (max - start + 1);
    }

    public float getAverageDivisibleBySeven(int start, int max) {
        int x = start;
        float sum = 0;
        int count = 0;
        while (x <= max) {
            if (x % 7 == 0) {
                sum += x; //  sum = sum + x;
                count++;
            }

            x++;
        }
        return sum / count;
    }


    //tema lab12 For Loops

    public void verifyNo(int number) {
        for (int i = number; number <= 100; number++) {
            System.out.println(number);
        }
    }

    public void negativeNo(int no) {
        for (int i = no; no > -101; no--) {
            System.out.println(no);
        }
    }

    public void countBetweenTwoNumbers(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }

    }

    public void countStartSmallestNo(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
        for (int i = second; i <= first; i++) {
            System.out.println(i);
        }
    }

    public void getEvenNumbers(int start, int max) {
        for (int x = start; x <= max; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    public void getUnevenNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int sumToHundred(int start) {
        int sum = 0;
        for (int i = start; i <= 100; i++) {
            sum = i + sum;
        }
        return sum;
    }

    public float getAverageToHundred(int set) {
        int sum = 0;
        for (int x = set; x <= 100; x++) {
            sum = x + sum;
        }
        return sum / (101 - set);
    }

    public void printStars(int star) {
        for (int x = 1; x <= star; x++) {
            for (int y = star; y >= x; y--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //tema lab12 While Loop

    public void countToHundred(int number) {
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }

    public void countToMinusHundred(int nr) {
        while (nr >= -100) {
            System.out.println(nr);
            nr--;
        }
    }

    public void countFrstToScnd(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
        while (x >= y) {
            System.out.println(x);
            x--;
        }
    }

    public void countMinMax(int a, int b) {
        while (a <= b) {
            System.out.println(a);
            a++;
        }
        while (a >= b) {
            System.out.println(b);
            b++;
        }
    }

    public void evenNum(int x, int y) {
        while (x <= y) {
            System.out.println(x * 2);
            x++;
        }
    }

    public void unevenNum(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x += 2;
        }
    }

    public float getSumAndAverage(int start, int max) {
        int sum = 0;
        float count = 0;
        while (start <= max) {
            sum += start; //  sum = sum + start;
            start++;
            count++;
        }
        return sum / count;
    }

    public void moduloSeven(int first, int second) {
        while (first <= second) {
            if (first % 7 == 0)
                System.out.println(first);
            first++;
        }
    }

    public void fibonacciSeries(int count) {
        int n1 = 0, n2 = 1, n3;
        int i = 0;
        while (i < count) {
            n3 = n1 + n2;
            System.out.println(("" + n3));
            ++i;
            n1 = n2;
            n2 = n3;
        }
    }

    public void cozaLozaWoza(int i) {
        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }


    public int[] populateArray(int max) {
        int[] myArr = new int[max];
        for (int i = 0; i < max; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public float getAverageValueFromArray(int[] array) {
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (sum / array.length);
    }

    public boolean isWordInArray(String[] sir, String word) {
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] == word) {
                return true;
            }
        }
        return false;
    }

    public void getEvenNrArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public void getNumberPositionInArray(int[] array, int number) {
        int index = 0;
        for (int i = 0; (i < array.length) && (index == 0); i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        System.out.println(index);
    }

    public void printPattern(String[] arraySir) {
        for (int i = 0; i < arraySir.length; i++) {
            System.out.println(arraySir[i]);
        }
    }

    public void skipNumber(int[] arr1, int number) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != number) {
                System.out.print(arr1[i] + " ");
            }
        }
    }

    public int getSecondSmallest(int[] arr, int number) {
        int min;
        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        return arr[1];
    }

    public void copyArray(int[]arr2, int[]arr3) {
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }}






















