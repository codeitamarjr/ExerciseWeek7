import java.util.Scanner;

public class NextDay {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's the day?");
        int day = keyboard.nextInt();
        System.out.println("What's the month without 0?");
        int month = keyboard.nextInt();
        System.out.println("What's the year?");
        int year = keyboard.nextInt();
        //int year = 1900;
        //with the variable was defined by the user, the statement bellow will start an int variable daysMonth
        int daysMonth;

        //Leap Year: If the YEAR is divisible by 4 AND is not divisible by 100 OR its divisible by 4 AND 100 AND 400) its a leap year!
        if( (year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0))
        daysMonth = 29; //if it's true we have 29 days in feb as a leap year
            else daysMonth =28; // if it's false we have 28 days in feb

        //System.out.println(daysMonth);

        //Last Day: If the day is the last one the statement will add 1 year and set the result to 1\1
        if (day + 1 > 30 & month + 1 > 12) {
            System.out.println(" The following day of " + day + "\\" + month + "\\" + year + " is 1\\1\\" + (year + 1));
        } else {

            //daysMonth: The statement bellow will set de daysMonth for each month ( Exception for 2 which is already defined)
            switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysMonth = 31;
            //After set de daysMonth the If statement will check if the day after is greater than the daysMonth
            //If the day after is less than the daysMonth it'll just add one day:
                if ((day + 1) <= daysMonth)
                    System.out.println("The following day is " + (day + 1) + "\\" + month + "\\" + year);
            //Id the day after is greater than the daysMonth it'll add one to month and print 1 as a day:
                else System.out.println("The following day is 1\\" + (month + 1) + "\\" + year);
                break; //the program I'll break right here or follow to the next statement and so on...

            case 2:
               if ((day + 1) <= daysMonth)
                    System.out.println("The following day is " + (day + 1) + "\\" + month + "\\" + year);
                else System.out.println("The following day is 1\\" + (month + 1) + "\\" + year);
                break;

            case 4, 6, 9, 11:
                daysMonth = 30;
                if ((day + 1) <= daysMonth)
                    System.out.println("The following day is " + (day + 1) + "\\" + month + "\\" + year);
                else System.out.println("The following day is 1\\" + (month + 1) + "\\" + year);
                break;

            }
        }
    }
}

// Leap year rule:
//        https://docs.microsoft.com/en-us/office/troubleshoot/excel/determine-a-leap-year