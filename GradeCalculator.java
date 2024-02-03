import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        // Input marks and calculate total
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Display total marks and average percentage
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}