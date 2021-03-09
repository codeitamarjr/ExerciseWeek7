import java.util.Scanner;

public class BonusScheme {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = keyboard.next();

        System.out.println("How much hours do you work overtime?");
        int overtimeHour = keyboard.nextInt();
        System.out.println("How much hours do you absence?");
        int timeAbsence = keyboard.nextInt(),bonusPaid;

        int hourReference = overtimeHour-((2/3)*timeAbsence);
        if(hourReference>40)
            bonusPaid = 50;
         else if(hourReference>30 && hourReference<=40)
            bonusPaid = 40;
         else if(hourReference>20 && hourReference<=30)
            bonusPaid = 30;
         else if(hourReference>10 && hourReference<=20)
            bonusPaid = 20;
         else
            bonusPaid = 10;


        System.out.println("Congrats "+name+". You worked "+overtimeHour+" overtime hours and have "+timeAbsence+" hours as absence.");
        System.out.println("You'll get $"+bonusPaid+" as bonus!");

    }
}
