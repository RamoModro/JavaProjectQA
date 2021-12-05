import java.util.List;
import java.util.Scanner;

public class MenuOptions {
    Scanner scan = new Scanner(System.in);
    Calculator calc = new Calculator();
    ReadFromKeyboard read = new ReadFromKeyboard();
    LogicalOperation op = new LogicalOperation();


    public void doSum() {
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Sum result is: " +
                calc.sum(first, second));
    }

    public void doSubtract() {
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Substraction result is: " +
                calc.substraction(first, second));
    }

    public void doMultiply() {
        int first = read.getInt();
        double second = read.getInt();
        System.out.println("Multiplication result is: " +
                calc.multiply(first, second));

    }

    public void doDivision() {
        int first = read.getInt();
        double second = read.getInt();
        System.out.println("Division result is: " +
                calc.divide(first, second));

    }

    public void doModulo() {
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Modulo result is: " + calc.modulo(first, second));
    }

    public void doAverage() {
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("Average result is: " + calc.media(first, second, third));
    }

    public void doCelsiusTemp() {
        int F = read.getInt();
        System.out.println("Temperature in Celsius degrees is: " + calc.celsiusTemp(F));
    }

    public void doDistance() {
        int inch = read.getInt();
        System.out.println("Distance in meters is: " + calc.distance(inch));
    }

    public void doCheckText() {
        String text = read.getString();
        System.out.println(op.checkText(text));
    }

    public void doPrintNumber() {
        int number = read.getInt();
        System.out.println("The number between 2 and 8 is: " + op.printNumber(number));
    }

    public void doCheckBiggerNumber() {
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Biggest number is: " + op.checkBiggerNumber(first, second));
    }

    public void doTextOrNumber() {
        String text = read.getString();
        int number = read.getInt();
        System.out.println("The result is " + op.textNumber(text, number));
    }

    public void doSnowForecast() {
        int y = read.getInt();
        System.out.println(op.snowForecast(y));
    }

    public void doHowIsInputNumber() {
        int x = read.getInt();
        System.out.println(op.howIsNumber(x));
    }

    public void doPrintInputNum() {
        int number = read.getInt();
        System.out.println(op.printNum(number));
    }

    public void doIsNumberEven() {
        int number = read.getInt();
        System.out.println(op.isNumberEven(number));
    }

    public void doIsEligibleToVote() {
        int number = read.getInt();
        System.out.println(op.isEligibleToVote(number));
    }

    public void doReturnBiggestNo() {
        int a = read.getInt();
        int b = read.getInt();
        int c = read.getInt();
        System.out.println(op.returnBiggestNo(a, b, c));
    }

    public void doCountBackwards() {
        int small = read.getInt();
        int big = read.getInt();
        System.out.println(op.countBackwards(small, big));
    }

    public void doGetAverageFromInterval() {
        int start = read.getInt();
        int max = read.getInt();
        System.out.println("The average is:" + op.getAverageFromInterval(start, max));
    }

    public void doGetAverageDivisibleBySeven() {
        int start = read.getInt();
        int max = read.getInt();
        System.out.println("The average is:" + op.getAverageDivisibleBySeven(start, max));
    }

    public void doVerifyNo() {
        int number = read.getInt();
        System.out.println("The number is:" + op.verifyNo(number));
    }

    public void doNegativeNo() {
        int no = read.getInt();
        op.negativeNo(no);
    }

    public void doCountBetweenTwoNumbers() {
        int first = read.getInt();
        int second = read.getInt();
        op.countBetweenTwoNumbers(first, second);
    }

    public void doCountStartSmallestNo() {
        int first = read.getInt();
        int second = read.getInt();
        op.countStartSmallestNo(first, second);
    }

    public void doGetEvenNumbers() {
        int start = read.getInt();
        int max = read.getInt();
        op.getEvenNumbers(start, max);
    }

    public void doGetUnevenNumbers() {
        int start = read.getInt();
        int end = read.getInt();
        op.getUnevenNumbers(start, end);
    }

    public void doSumToHundred() {
        int start = read.getInt();
        System.out.println(op.sumToHundred(start));
    }

    public void doGetAverageToHundred() {
        int set = read.getInt();
        System.out.println(op.getAverageToHundred(set));
    }

    public void doPrintStars() {
        int star = read.getInt();
        op.printStars(star);
    }

    public void doCountToHundred() {
        int number = read.getInt();
        op.countToHundred(number);
    }

    public void doCountToMinusHundred() {
        int nr = read.getInt();
        op.countToMinusHundred(nr);
    }

    public void doCountFrstToScnd() {
        int x = read.getInt();
        int y = read.getInt();
        op.countFrstToScnd(x, y);
    }

    public void doCountMinMax() {
        int a = read.getInt();
        int b = read.getInt();
        op.countMinMax(a, b);
    }

    public void doEvenNumbersLoop() {
        int x = read.getInt();
        int y = read.getInt();
        op.evenNum(x, y);
    }

    public void doUnevenNumbersLoop() {
        int x = read.getInt();
        int y = read.getInt();
        op.unevenNum(x, y);
    }

    public void doGetSumAndAverageLoop() {
        int start = read.getInt();
        int max = read.getInt();
        op.getSumAndAverage(start, max);
    }

    public void doModuloSeven() {
        int first = read.getInt();
        int second = read.getInt();
        op.moduloSeven(first, second);
    }

    public void doFibonacciSeries() {
        int count = read.getInt();
        op.fibonacciSeries(count);
    }

    public void doCozaLozaWoza() {
        int i = read.getInt();
        op.cozaLozaWoza(i);
    }

    public void doPopulateArray() {
        int max = read.getInt();
        System.out.println(op.populateArray(max));
    }

    public void doPrintArray() {
        int[] max = read.getArray(3);
        op.printArray(max);
    }

    public void doGetAverageValueFromArray() {
        int[] array = read.getArray(3);
        System.out.println(op.getAverageValueFromArray(array));
    }

    public void doGetEvenArrayToHundred() {
        int[] evenArray = read.getArray(3);
        System.out.println(op.getAverageValueFromArray(evenArray));
    }

    public void doGetNumberPositionInArray() {
        int[] array = read.getArray(3);
        int number = read.getInt();
        System.out.println(op.getNumberPositionInArray(array, number));
    }

    public void doPrintPattern() {
        String line = read.getString();
        op.printPattern();
    }

    public void doRemoveNumberFromArray() {
        int[] myArray = read.getArray(3);
        int nr = read.getInt();
        System.out.println(op.removeNumber(myArray, nr));

    }

    public void doGetSecondSmallestFromArray() {
        int[] myArray = read.getArray(3);
        int nr = read.getInt();
        System.out.println(op.getSecondSmallest(myArray, nr));
    }

    public void doCopyArray(){
        int[] array1 = read.getArray(3);
        int[] array2 = read.getArray(3);
        System.out.println(op.copyArray(array1,array2));
    }

    public void doGetPopulatedList(){
        int max = read.getInt();
        System.out.println(op.getPopulatedList(max));
    }

    public void doPrintList(){
        List<Integer> myList = read.getList();
        op.printList(myList);
    }
    public void doAddNumberAtTheEndOfList(){
        List<Integer> myList = read.getList();
        int parametru = read.getInt();
        op.addNumberAtTheEndOfList(myList,parametru);
    }

    public void doPrintListFromNumber(){
        List<Integer> myList = read.getList();
        int number = read.getInt();
        op.printListFromNumber(myList,number);
    }
    public void doPrintListFromEnd(){
        List<Integer> myList = read.getList();
        op.printListFromEnd(myList);
    }

    public void doSetFirstPosition(){
        List<Integer> myList = read.getList();
        int number = read.getInt();
        op.setFirstPosition(myList,number);
    }

    public void doGetIndexAndValue(){
        List<Integer> myList = read.getList();
        op.getIndexAndValue(myList);
    }

    public void doGetHighestNumber(){
        List<Integer> myList = read.getList();
        op.getHighestNumber(myList);
    }

    }
