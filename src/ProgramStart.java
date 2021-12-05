public class ProgramStart extends MenuOptions{

    ReadFromKeyboard read = new ReadFromKeyboard();

    public void printMenu(){
        System.out.println("Please select an option:\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. Multiply\n" +
                "4. Divide\n" +
                "5. Modulo\n" +
                "6. Average\n" +
                "7. Celsius Temp\n" +
                "8. Distance\n" +
                "9. Check Text\n" +
                "10.Print Number\n" +
                "11.Check Bigger Number\n" +
                "12.Text&Number\n" +
                "13.Snow Forecast\n" +
                "14.How Is Number\n" +
                "15.Print Input Number\n" +
                "16.Is Number Even\n" +
                "17.Is Eligible To Vote\n" +
                "18.Return Biggest No\n" +
                "19.Count Backwards\n" +
                "20.Get Average From Interval\n" +
                "21.Get Average Divisible By Seven\n" +
                "22.Verify No\n" +
                "23.Negative No\n" +
                "24.Count Between Two Numbers\n" +
                "25.Count Start Smallest No\n" +
                "26.Get Even Numbers\n" +
                "27.Get Uneven Numbers\n" +
                "28.Sum To Hundred\n" +
                "29.Get Average To Hundred\n" +
                "30.Print Stars\n" +
                "31.Count To Hundred\n" +
                "32.Count To Minus Hundred\n" +
                "33.Count Frst To Scnd\n" +
                "34.Count Min Max\n" +
                "35.Even Num Loop\n" +
                "36.Uneven Num Loop\n" +
                "37.Get Sum And Average Loop\n" +
                "38.Modulo Seven Loop\n" +
                "39.Fibonacci Series\n" +
                "40.CozaLozaWoza\n" +
                "41.Populate Array\n" +
                "42.Print Array\n" +
                "43.Get Average Value From Array\n" +
                "44.Get Even ArrayNo To Hundred\n" +
                "45.Get Number Position In Array\n" +
                "46.Print Pattern\n" +
                "47.Remove Number from Array\n" +
                "48.Get Second Smallest from array\n" +
                "49.Copy Array\n" +
                "50.Get Populated List\n" +
                "51.Print List\n" +
                "52.Add Number At The End Of List\n" +
                "53.Print List From Given Number\n" +
                "54.Print List From End\n" +
                "55.Set First Position in List\n" +
                "56.Get Index And Value from List\n" +
                "57.Get Highest Number from List\n" +
                "0. Exit\n");
    }

    public boolean runMenuOption(){
        printMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println("Goodbye!");
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubtract();
                return true;
            case 3:
                doMultiply();
                return true;
            case 4:
                doDivision();
                return true;
            case 5:
                doModulo();
                return true;
            case 6:
                doAverage();
                return true;
            case 7:
                doCelsiusTemp();
                return true;
            case 8:
                doDistance();
                return true;
            case 9:
                doCheckText();
                return true;
            case 10:
                doPrintNumber();
                return true;
            case 11:
                doCheckBiggerNumber();
                return true;
            case 12:
                doTextOrNumber();
                return true;
            case 13:
                doSnowForecast();
                return true;
            case 14:
                doHowIsInputNumber();
                return true;
            case 15:
                doPrintInputNum();
                return true;
            case 16:
                doIsNumberEven();
                return true;
            case 17:
                doIsEligibleToVote();
                return true;
            case 18:
                doReturnBiggestNo();
                return true;
            case 19:
                doCountBackwards();
                return true;
            case 20:
                doGetAverageFromInterval();
                return true;
            case 21:
                doGetAverageDivisibleBySeven();
                return true;
            case 22:
                doVerifyNo();
                return true;
            case 23:
                doNegativeNo();
                return true;
            case 24:
                doCountBetweenTwoNumbers();
                return true;
            case 25:
                doCountStartSmallestNo();
                return true;
            case 26:
                doGetEvenNumbers();
                return true;
            case 27:
                doGetUnevenNumbers();
                return true;
            case 28:
                doSumToHundred();
                return true;
            case 29:
                doGetAverageToHundred();
                return true;
            case 30:
                doPrintStars();
                return true;
            case 31:
                doCountToHundred();
                return true;
            case 32:
                doCountToMinusHundred();
                return true;
            case 33:
                doCountFrstToScnd();
                return true;
            case 34:
                doCountMinMax();
                return true;
            case 35:
                doEvenNumbersLoop();
                return true;
            case 36:
                doUnevenNumbersLoop();
                return true;
            case 37:
                doGetSumAndAverageLoop();
                return true;
            case 38:
                doModuloSeven();
                return true;
            case 39:
                doFibonacciSeries();
                return true;
            case 40:
                doCozaLozaWoza();
                return true;
            case 41:
                doPopulateArray();
                return true;
            case 42:
                doPrintArray();
                return true;
            case 43:
                doGetAverageValueFromArray();
                return true;
            case 44:
                doGetEvenArrayToHundred();
                return true;
            case 45:
                doGetNumberPositionInArray();
                return true;
            case 46:
                doPrintPattern();
                return true;
            case 47:
                doRemoveNumberFromArray();
                return true;
            case 48:
                doGetSecondSmallestFromArray();
                return true;
            case 49:
                doCopyArray();
                return true;
            case 50:
                doGetPopulatedList();
                return true;
            case 51:
                doPrintList();;
                return true;
            case 52:
                doAddNumberAtTheEndOfList();
                return true;
            case 53:
                doPrintListFromNumber();
                return true;
            case 54:
                doPrintListFromEnd();
                return true;
            case 55:
                doSetFirstPosition();
                return true;
            case 56:
                doGetIndexAndValue();
                return true;
            case 57:
                doGetHighestNumber();
                return true;


            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public void runProgram(){
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }
}
