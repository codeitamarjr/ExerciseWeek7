import java.util.Scanner;

public class TimesAbroad {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int hourNow, minutesNow;

        System.out.println("What hour is right now?");
        hourNow = keyboard.nextInt();
        System.out.println("What's the minutes right now?");
        minutesNow = keyboard.nextInt();

        int timeZoneMoscow = hourNow+3;

        if (timeZoneMoscow>24){
            timeZoneMoscow-=24;
        }

        int timeZoneTokyo = hourNow+9;

        if (timeZoneTokyo>24){
            timeZoneTokyo-=24;
        }

        int timeZoneWashington = hourNow-5;

        if (timeZoneWashington>24){
            timeZoneWashington-=24;
        }

        int timeZoneBrazil = hourNow-3;

        if (timeZoneBrazil>24){
            timeZoneBrazil-=24;
        }

        System.out.println("So now is "+hourNow+":"+minutesNow);
        System.out.println("In Moscow is "+timeZoneMoscow+":"+minutesNow);
        System.out.println("In Tokyo is "+timeZoneTokyo+":"+minutesNow);
        System.out.println("In Washington is "+timeZoneWashington+":"+minutesNow);
        System.out.println("In Brazil is "+timeZoneBrazil+":"+minutesNow);
    }
}
