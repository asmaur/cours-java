package StudentDatabase;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numer of students: ");

        int numberOfStudents = input.nextInt();

        Student[] students = new Student[numberOfStudents];

        for (int n=0; n<numberOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payBalance();
            
        }

        for (int n=0; n<numberOfStudents; n++){
            System.out.println(students[n].toString());
        }

        
    }
    
}
