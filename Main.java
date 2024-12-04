import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);


        String studentStatus = scnr.next();
        double homework = scnr.nextDouble();
        double quizzes = scnr.nextDouble();
        double midterm = scnr.nextDouble();
        double finalExam = scnr.nextDouble();


        double homeworkAverage = (homework / 800.0) * 100.0;
        double quizzesAverage = (quizzes / 400.0) * 100.0;
        double midtermAverage = (midterm / 150.0) * 100.0;
        double finalExamAverage = (finalExam / 200.0) * 100.0;


        if (studentStatus.equals("UG")) {
            System.out.printf("Homework: %.1f%%\n", homeworkAverage);
            System.out.printf("Quizzes: %.1f%%\n", quizzesAverage);
            System.out.printf("Midterm: %.1f%%\n", midtermAverage);
            System.out.printf("Final Exam: %.1f%%\n", finalExamAverage);

        }
        else if (studentStatus.equals("G")){
            System.out.printf("Homework: %.1f%%\n", homeworkAverage);
            System.out.printf("Quizzes: %.1f%%\n", quizzesAverage);
            System.out.printf("Midterm: %.1f%%\n", midtermAverage);
            System.out.printf("Final Exam: %.1f%%\n", finalExamAverage);
        }
        else if (studentStatus.equals("DL")){
            System.out.printf("Homework: %.1f%%\n", homeworkAverage);
            System.out.printf("Quizzes: %.1f%%\n", quizzesAverage);
            System.out.printf("Midterm: %.1f%%\n", midtermAverage);
            System.out.printf("Final Exam: %.1f%%\n", finalExamAverage);

        }
        else {
            System.out.println("Error: student status must be UG, G or DL");
        }


       /* if (homeworkAverage > 100) {
            homeworkAverage = 100;
        }
        if (quizzesAverage > 100) {
            quizzesAverage = 100;
        }
        if (midtermAverage > 100) {
            midtermAverage = 100;
        }
        if (finalExamAverage > 100) {
            finalExamAverage = 100;
        } */

        // Output averages after setting to 100%
        System.out.printf("Homework: %.1f%%\n", homeworkAverage);
        System.out.printf("Quizzes: %.1f%%\n", quizzesAverage);
        System.out.printf("Midterm: %.1f%%\n", midtermAverage);
        System.out.printf("Final Exam: %.1f%%\n", finalExamAverage);

        // Step 3: Calculate course average
        double courseAverage = 0.0;
        switch (studentStatus) {
            case "UG":
                courseAverage = (homeworkAverage * 0.2) + (quizzesAverage * 0.2) + (midtermAverage * 0.3) + (finalExamAverage * 0.3);
                System.out.printf("UG average: %.1f%%\n", courseAverage);
                break;
            case "G":
                courseAverage = (homeworkAverage * 0.15) + (quizzesAverage * 0.05) + (midtermAverage * 0.35) + (finalExamAverage * 0.45);
                System.out.printf("G average: %.1f%%\n", courseAverage);
                break;
            case "DL":
                courseAverage = (homeworkAverage * 0.05) + (quizzesAverage * 0.05) + (midtermAverage * 0.4) + (finalExamAverage * 0.5);
                System.out.printf("DL average: %.1f%%\n", courseAverage);
                break;
        }


        int courseLetterGrade;
        if (courseAverage >= 90.0) {
            courseLetterGrade = 'A';
        } else if (courseAverage >= 80.0) {
            courseLetterGrade = 'B';
        } else if (courseAverage >= 70.0) {
            courseLetterGrade = 'C';
        } else if (courseAverage >= 60.0) {
            courseLetterGrade = 'D';
        } else {
            courseLetterGrade = 'F';
        }
        System.out.println("Course grade: " + courseLetterGrade);


    }
}
