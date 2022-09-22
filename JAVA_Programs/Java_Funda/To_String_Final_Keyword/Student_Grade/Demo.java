package Question_1;

import java.util.Scanner;

public class Demo {
    public void displayDetails(){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Roll Number");
        int rollNumber = s1.nextInt();
        System.out.println("Enter Name");
        String studentName = s1.next();
        System.out.println("Enter Marks");
        int studentMarks = s1.nextInt();
        System.out.println("******%%%%***STUDENT DETAILS*****%%%%%%*****");
        StudentBean student = new StudentBean(rollNumber,studentName,studentMarks,calculateGrade(studentMarks));

        System.out.println("Roll Number of Student is :- " + student.getRoll());
        System.out.println("Student Name is :- " + student.getName());
        System.out.println("Student Marks is :- " + student.getMarks());
        System.out.println("Student Grade is :- " + student.getGrade());
    }
    private char calculateGrade(int marks){
        if (marks >= 500) {
           return 'A';
        }else if (marks < 500 && marks >= 400){
            return 'B';
        }else if (marks < 400){
            return 'C';
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Demo details = new Demo();
        details.displayDetails();
    }
}
