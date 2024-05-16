package TASK2;

import java.util.*;

public class Grade_calculator {
    public static String gradingSystem(double score) {
        if (score >= 90) {
            return ("Grade A");
        } else if (score >= 80) {
            return ("Grade B");
        } else if (score >= 70) {
            return ("Grade C");
        } else if (score >= 60) {
            return ("Grade D");
        } else {
            return ("Grade Fail!!");
        }
    }

    public static void main(String[] args) {
        String studentName;
        int totalSubjects, totalMarks = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of student : ");
        studentName = input.nextLine();
        System.out.print("\nEnter the number of subjects : ");
        totalSubjects = input.nextInt();

        int subMarks[] = new int[totalSubjects];
        System.out.println("\nEnter Marks for each subject->");
        for (int i = 0; i < totalSubjects; i++) {
            // Taking input of the marks in each subject.
            System.out.print("\nEnter Marks for SUBJECT " + (i + 1) + " : ");
            subMarks[i] = input.nextInt();
            totalMarks = totalMarks + subMarks[i];
        }

        double avgPercentage = (double) totalMarks / totalSubjects;
        String studGrade = gradingSystem(avgPercentage);
        System.out.println("\nName of student : " + studentName);
        System.out.println(
                "Total marks obtained by " + studentName + " is : " + totalMarks + "/" + (totalSubjects * 100));
        System.out.println("Average percentage obtained by " + studentName + " is : " + avgPercentage+"%");
        System.out.println(studGrade);
        input.close();
    }
}
