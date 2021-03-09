import java.util.Scanner;

public class ExamMarks {

    public static void main(String[] args){

        System.out.println("Welcome to the Exam Marks");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your mark on the 1st exam?");
        int firstExamMark = keyboard.nextInt();
        System.out.println("What's your mark on the 2nd exam?");
        int secondExamMark = keyboard.nextInt();
        System.out.println("What's your mark on the 3rd exam?");
        int thirdExamMark = keyboard.nextInt();

        if (firstExamMark>40){
                boolean resultFirstExam=true;
        }
        if (secondExamMark>40){
                boolean resultSecondExam=true;
        }
        if (thirdExamMark>40){
                boolean resultThirdExam=true;
        }

        if(firstExamMark>40 & secondExamMark>40 & thirdExamMark>40){
            System.out.println("You passed!");
        }

        //if only one exam is failed and the overall average is greater than or equal to 50.

        if( (firstExamMark+secondExamMark>100) && (firstExamMark+thirdExamMark>100) && (secondExamMark+thirdExamMark>100) ){
            System.out.println("You have passed for the reason that you got");
            //I have to finish this one
        }
    }
}
