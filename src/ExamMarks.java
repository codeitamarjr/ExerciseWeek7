import java.util.Scanner;

public class ExamMarks {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your mark on the 1st exam?");
        int firstExamMark = keyboard.nextInt();
        System.out.println("What's your mark on the 2nd exam?");
        int secondExamMark = keyboard.nextInt();
        System.out.println("What's your mark on the 3rd exam?");
        int thirdExamMark = keyboard.nextInt();

        String overallMessage = "an overall average is greater than or equal to 50!";
        if(firstExamMark >=40 && secondExamMark >=40 && thirdExamMark>=40){
            System.out.println("Congratulation you pass in all the exams!");


        } else if ((firstExamMark+secondExamMark)/2 >=50){
            System.out.println("Congratulations, although you fail on the third exam " +overallMessage);
        } else if ((firstExamMark+thirdExamMark)/2 >=50) {
            System.out.println("Congratulations, although you fail on the second exam " +overallMessage);
        } else if ((secondExamMark+thirdExamMark)/2 >=50) {
            System.out.println("Congratulations, although you fail on the first exam " +overallMessage);
        } else System.out.println("You fail");
    }
}
