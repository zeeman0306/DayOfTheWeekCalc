import java.util.Arrays;

public class DayOfWeekCalculations {

    public void response(String doomsdayNumToDayOfWeek, double numMonth, double numDay, double numYear, String numMonthAsWord, int numMonthInt, int numDayInt, int numYearInt){

        String numDayString = (int)numDay + "";

        char[] numDayCharArray = numDayString.toCharArray();
        System.out.println("numDayCharArray = \n" + Arrays.toString(numDayCharArray));

        char numDayLastDigit = numDayCharArray[numDayCharArray.length - 1];
        System.out.println("numDayLastDigit = " + numDayLastDigit);

        String numDaySuffix = "";


        if((numDay >= 4) && (numDay <= 20)){
            numDaySuffix = "th";
        }else if(numDayLastDigit == '1'){
            numDaySuffix = "st";
        }else if(numDayLastDigit == '2'){
            numDaySuffix = "nd";
        }else if (numDayLastDigit == '3'){
            numDaySuffix = "rd";
        }

        numDayString = new String(numDayCharArray);

        String numDayPlusSuffix = numDayString + numDaySuffix;

        System.out.println(numMonthAsWord + " " + numDayPlusSuffix + ", " + numYearInt + " falls on a " + doomsdayNumToDayOfWeek);
        if(( numMonth == 3 ) && ( numDay == 6 ) && ( numYear == 1997 )){
            System.out.println("This is the creator's birthday \nAs well As Shaquille O'neal, Tyler the Creator, and Michelangelo");
        }

    }

    public void doomsdayNumToDay2(double dayOfWeekAsNum, String doomsdayNumToDayOfWeek, double numMonth, double numDay, double numYear, String numMonthAsWord, int numMonthInt, int numDayInt, int numYearInt) {
        System.out.println("dayOfWeekAsNum = " + dayOfWeekAsNum);
        if (dayOfWeekAsNum == 0) {
            doomsdayNumToDayOfWeek = ("Sunday");
            System.out.println("Step 5: Day of Week Retrieval Complete");
            response(doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (dayOfWeekAsNum == 1) {
            doomsdayNumToDayOfWeek = ("Monday");
            System.out.println("Step 5: Day of Week Retrieval Complete");
            response(doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (dayOfWeekAsNum == 2) {
            doomsdayNumToDayOfWeek = ("Tuesday");
            System.out.println("Step 5: Day of Week Retrieval Complete");
            response(doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (dayOfWeekAsNum == 3) {
            doomsdayNumToDayOfWeek = ("Wednesday");
            System.out.println("Step 5: Day of Week Retrieval Complete");
            response(doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (dayOfWeekAsNum == 4) {
            doomsdayNumToDayOfWeek = ("Thursday");
            System.out.println("Step 5: Day of Week Retrieval Complete");
            response(doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);
            /* This should run because dayOfWeekAsNum = 4 */

        } else if (dayOfWeekAsNum == 5) {
            doomsdayNumToDayOfWeek = ("Friday");
            System.out.println("Step 5: Day of Week Retrieval Complete");
            response(doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (dayOfWeekAsNum == 6) {
            doomsdayNumToDayOfWeek = ("Saturday");
            System.out.println("Step 5: Day of Week Retrieval Complete");
            response(doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        }
    }

    public void dateCalc(double numMonth, double numDay, double doomsday, String doomsdayNumToDayOfWeek, double doomsdayOfReferenceYear, double numYear, double numYearReferencePoint, String numMonthAsWord, int numMonthInt, int numDayInt, int numYearInt){

        double firstNum = doomsdayOfReferenceYear; /* This should be 3 */
        System.out.println("\nfirstNum = " + firstNum);
        double secondNum = Math.floor((numYear - numYearReferencePoint) / 12); /* This should be 8 */
        System.out.println("\nsecondNum = " + secondNum);
        double thirdNum = ((numYear - numYearReferencePoint) % 12); /* This should be 1 */
        System.out.println("\nthirdNum = " +thirdNum);
        double fourthNum = Math.floor(thirdNum / 4); /* This should be 0 */
        System.out.println("\nfourthNum = " + fourthNum);
        double numSum = firstNum + secondNum + thirdNum + fourthNum; /* THis should be 12 */
        System.out.println("\nnumSum = " + numSum);
        double doomsdayOfNumYear = (numSum % 7); /* This should be 5*/
        System.out.println("\ndoomsdayOfNumYear = " + doomsdayOfNumYear);

        double numDayDoomsdayDifference = numDay - doomsday; /* This should be (-8) */
        System.out.println("\nnumDayDoomsdayDifference = " + numDayDoomsdayDifference);

        double numDayDoomsdayDifferenceModulo;
        double dayOfWeekAsNum = 0;

        if(numDayDoomsdayDifference < 0){ /* This should run because numDayDoomsdayDifference is (-8), which is less than 0 */

            numDayDoomsdayDifferenceModulo = (((numDayDoomsdayDifference * -1) % 7) * -1);
            dayOfWeekAsNum = numDayDoomsdayDifferenceModulo + doomsdayOfNumYear;
            System.out.println("\nnumDayDoomsdayDifferenceModulo = " + numDayDoomsdayDifferenceModulo);

        }else if(numDayDoomsdayDifference > 0){

            numDayDoomsdayDifferenceModulo = numDayDoomsdayDifference % 7;
            dayOfWeekAsNum = numDayDoomsdayDifferenceModulo + doomsdayOfNumYear;
            System.out.println("\nnumDayDoomsdayDifferenceModulo = " + numDayDoomsdayDifferenceModulo);

        }else if (numDayDoomsdayDifference == 0){

            numDayDoomsdayDifferenceModulo = numDayDoomsdayDifference;
            dayOfWeekAsNum = doomsdayOfNumYear;
            System.out.println("\nnumDayDoomsdayDifferenceModulo = " + numDayDoomsdayDifferenceModulo);

        }

        if(dayOfWeekAsNum > 6){
            dayOfWeekAsNum %= 7;
        }else if(dayOfWeekAsNum < 0){
            dayOfWeekAsNum += 7;
        }

        System.out.println("\ndayOfWeekAsNum = " + dayOfWeekAsNum);
        System.out.println("Step 4: Overall Date Calculation Complete");
        doomsdayNumToDay2(dayOfWeekAsNum, doomsdayNumToDayOfWeek, numMonth, numDay, numYear, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

    }

    public void doomsdayOfReferenceYearCalc(double numYearReferencePoint, double doomsdayOfReferenceYear, double numDay, double doomsday, double numYear, double numMonth, String doomsdayNumToDayOfWeek, String numMonthAsWord, int numMonthInt, int numDayInt, int numYearInt){


        if ((numYearReferencePoint % 400) == 0) {
            doomsdayOfReferenceYear = 2;
            doomsdayNumToDayOfWeek = ("Tuesday");
            System.out.println("Step 3: First Number/Doomsday of Reference Year Calculation Complete");
            dateCalc(numMonth, numDay, doomsday, doomsdayNumToDayOfWeek, doomsdayOfReferenceYear, numYear, numYearReferencePoint, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (((numYearReferencePoint + 100) % 400) == 0) {
            doomsdayOfReferenceYear = 3;
            doomsdayNumToDayOfWeek = ("Wednesday");
            System.out.println("Step 3: First Number/Doomsday of Reference Year Calculation Complete");
            dateCalc(numMonth, numDay, doomsday, doomsdayNumToDayOfWeek, doomsdayOfReferenceYear, numYear, numYearReferencePoint, numMonthAsWord, numMonthInt, numDayInt, numYearInt);
            //This runs because 3/6/1997 fits its criteria
            //doomsdayOfReferenceYear = 3
            //doomsdayNumToDayOfWeek = Wednesday

        } else if (((numYearReferencePoint - 100) % 400) == 0) {
            doomsdayOfReferenceYear = 0;
            doomsdayNumToDayOfWeek = ("Sunday");
            System.out.println("Step 3: First Number/Doomsday of Reference Year Calculation Complete");
            dateCalc(numMonth, numDay, doomsday, doomsdayNumToDayOfWeek, doomsdayOfReferenceYear, numYear, numYearReferencePoint, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if ((((numYearReferencePoint - 200) % 400) == 0 ) || ((numYearReferencePoint + 200) % 400)  == 0 ) {
            doomsdayOfReferenceYear = 5;
            doomsdayNumToDayOfWeek = ("Friday");
            System.out.println("Step 3: First Number/Doomsday of Reference Year Calculation Complete");
            dateCalc(numMonth, numDay, doomsday, doomsdayNumToDayOfWeek, doomsdayOfReferenceYear, numYear, numYearReferencePoint, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        }

    }

    public void leapYearCheck2(double numMonth, double numYear, double doomsday, double numYearReferencePoint, double doomsdayOfReferenceYear, double numDay, String doomsdayNumToDayOfWeek, String numMonthAsWord, int numMonthInt, int numDayInt, int numYearInt){


        if ((numYear % 400) == 0){
            doomsday = doomsday + 1;
            System.out.println("Step 2.5: Leap Year Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        }else if (((numYear % 4) == 0)&&((numYear % 100) != 0)){
            doomsday = doomsday + 1;
            System.out.println("Step 2.5: Leap Year Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        }else{
            System.out.println("Step 2.5: Leap Year Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        }

    }

    public void keyDayCalc(double numMonth, double numYearReferencePoint, double doomsdayOfReferenceYear, double numDay, double numYear, String doomsdayNumToDayOfWeek, String numMonthAsWord, int numMonthInt, int numDayInt, int numYearInt) {

        double doomsday;

        if (numMonth == 3) {
            doomsday = 14;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

            } else if (numMonth == 4) {
            doomsday = 4;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 5) {
            doomsday = 9;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 6) {
            doomsday = 6;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 7) {
            doomsday = 11;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 8) {
            doomsday = 8;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 9) {
            doomsday = 5;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 10) {
            doomsday = 10;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 11) {
            doomsday = 7;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 12) {
            doomsday = 12;
            System.out.println("Step 2: Doomsday Calculation Complete");
            doomsdayOfReferenceYearCalc(numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsday, numYear, numMonth, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 2) {
            doomsday = 28;
            System.out.println("Step 2: Doomsday Calculation Complete");
            leapYearCheck2(numMonth, numYear, doomsday, numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else if (numMonth == 1) {
            doomsday = 3;
            System.out.println("Step 2: Doomsday Calculation Complete");
            leapYearCheck2(numMonth, numYear, doomsday, numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        }
    }

    public void dateErrorLeapYearCheck() {
        System.out.println("That Leap Year doesn't exist");
    }

    //Step 1.5: Leap Year Validity
    public void leapYearCheck(double numYear, double numMonth, double numYearReferencePoint, double doomsdayOfReferenceYear, double numDay, String doomsdayNumToDayOfWeek, String numMonthAsWord, int numMonthInt, int numDayInt, int numYearInt) {
        if ((numYear % 400) == 0) {
            System.out.println("Step 1.5: Leap Year Validation Complete");
            System.out.println( numMonthAsWord + " " + numDayInt + ", " + numYearInt + " is a valid Leap Year.");
            keyDayCalc(numMonth, numYearReferencePoint, doomsdayOfReferenceYear, numDay, numYear, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);
        } else if (((numYear % 4) == 0) && ((numYear % 100) != 0)) {
            System.out.println("Step 1.5: Leap Year Validation Complete");
            System.out.println( numMonthAsWord + " " + numDayInt + ", " + numYearInt + " is a valid Leap Year.");
            keyDayCalc(numMonth, numYearReferencePoint, doomsdayOfReferenceYear, numDay, numYear, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);

        } else {
            dateErrorLeapYearCheck();
        }
    }

    public void dateError(){
        System.out.println("This date doesn't exist");
    }

    //Step 1: Date Validity
    public void monthDayErrorRule(double numMonth, double numDay, double numYear){

        String doomsdayNumToDayOfWeek = "";
        String numMonthAsWord = "";

        int numMonthInt = (int)numMonth;
        int numDayInt = (int)numDay;
        int numYearInt = (int)numYear;

        if(numMonth == 1){
            numMonthAsWord = "January";
        }else if(numMonth == 2){
            numMonthAsWord = "February";
        }else if(numMonth == 3){
            numMonthAsWord = "March";
        }else if(numMonth == 4){
            numMonthAsWord = "April";
        }else if(numMonth == 5){
            numMonthAsWord = "May";
        }else if(numMonth == 6){
            numMonthAsWord = "June";
        }else if(numMonth == 7){
            numMonthAsWord = "July";
        }else if(numMonth == 8){
            numMonthAsWord = "August";
        }else if(numMonth == 9){
            numMonthAsWord = "September";
        }else if(numMonth == 10){
            numMonthAsWord = "October";
        }else if(numMonth == 11){
            numMonthAsWord = "November";
        }else if(numMonth == 12){
            numMonthAsWord = "December";
        }

        double doomsdayOfReferenceYear = 0;
        double numYearReferencePoint = (100 * Math.floor(numYear / 100));


        if(numMonth < 1 || numMonth > 12){
            dateError();
        }else if(numDay < 1){
            dateError();
        }else if((numMonth == 1) && ( numDay > 31)){
            dateError();
        }else if((numMonth == 3) && ( numDay > 31)){
            dateError();
        }else if((numMonth == 5) && ( numDay > 31)){
            dateError();
        }else if((numMonth == 7) && ( numDay > 31)){
            dateError();
        }else if((numMonth == 8) && ( numDay > 31)){
            dateError();
        }else if((numMonth == 10) && ( numDay > 31)){
            dateError();
        }else if((numMonth == 12) && ( numDay > 31)) {
            dateError();
        }else if((numMonth == 4) && ( numDay > 30)){
            dateError();
        }else if((numMonth == 6) && ( numDay > 30)){
            dateError();
        }else if((numMonth == 9) && ( numDay > 30)){
            dateError();
        }else if((numMonth == 11) && ( numDay > 30)){
            dateError();
        }else if((numMonth == 2) && ( numDay > 29)){
            dateError();
        }else if((numMonth == 2) && (numDay == 29)){
            System.out.println("Step 1: Date Validation Complete");
            leapYearCheck(numYear, numMonth, numYearReferencePoint, doomsdayOfReferenceYear, numDay, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);
        }else{
            System.out.println("Step 1: Date Validation Complete");
            System.out.println( numMonthAsWord + " " + numDayInt + ", " + numYearInt + " is a valid date.");
            keyDayCalc(numMonth, numYearReferencePoint, doomsdayOfReferenceYear, numDay, numYear, doomsdayNumToDayOfWeek, numMonthAsWord, numMonthInt, numDayInt, numYearInt);
        }

    }

}