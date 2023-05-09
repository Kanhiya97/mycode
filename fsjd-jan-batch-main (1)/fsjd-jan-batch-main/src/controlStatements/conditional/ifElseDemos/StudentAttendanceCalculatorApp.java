package controlStatements.conditional.ifElseDemos;

import java.util.Scanner;

public class StudentAttendanceCalculatorApp {
    public static void main(String[] args) {

        /*
         * A student will not be allowed to sit in exam if his/her attendance is less than 75%.
         *
         * Take following input from user
         * Number of classes held
         * Number of classes attended.
         *
         * And print percentage of class attended
         *
         * Is student is allowed to sit in exam or not.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of classes held");
        int numberOfClassesHeld = scanner.nextInt();

        System.out.println("Enter the no. of classes attended");
        int numberOfClassesAttended = scanner.nextInt();

        System.out.println("Do you have any medical issues");

        boolean medicalIssue = scanner.nextBoolean();

        float attendancePercentage = numberOfClassesAttended * 100F / numberOfClassesHeld;

        System.out.println("**************** Student attendance Report **************");
        System.out.println("Number of classes held " + numberOfClassesHeld);
        System.out.println("Number of classes Attended " + numberOfClassesAttended);
        System.out.println("Attendance Percentage " + attendancePercentage);
        System.out.println("Medical Issue " + medicalIssue);
        System.out.println("********************************************************");

        if (attendancePercentage > 75.F || medicalIssue) {
            System.out.println("You are allowed to sit for the exam");
        } else {
            System.out.println("You are not allowed to sit for the exam");
        }


    }
}
