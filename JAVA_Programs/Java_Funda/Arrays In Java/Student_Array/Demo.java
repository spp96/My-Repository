package Question_5;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner studentDetails = new Scanner(System.in);

        System.out.println("Enter Number of Students : ");
        int number = studentDetails.nextInt();
        Student [] arr = new Student[number];
        for(int i=0;i<number;i++){
            System.out.println("********Enter details of Student : " + (i+1) + " ********");
            System.out.println("Enter Name Of Student : ");
            String name = studentDetails.next();

            System.out.println("Enter Address of Student : " );
            String address = studentDetails.next();

            System.out.println("Enter Roll No. Of Student : " );
            int roll = studentDetails.nextInt();

            System.out.println("Enter Marks of Student : ");
            int marks = studentDetails.nextInt();
            Student newStudent = new Student(roll,name,address,marks);
            arr[i]=newStudent;
        }
        studentDetails.close();

        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println((i+1)+"Student Details");
            System.out.println("Name : " + arr[i].getName());
            System.out.println("Address : " + arr[i].getAddress());
            System.out.println("Roll No. : " + arr[i].getRoll());
            System.out.println("Marks : " + arr[i].getMarks());
            System.out.println("***************XX*****************");
            sum += arr[i].getMarks();
        }
        double avg = sum/ arr.length;
        System.out.println("Average of all students : " + avg);

    }
}
