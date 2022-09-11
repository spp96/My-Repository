package Question_3;

import java.util.Scanner;

public class Course {
    int courseId;
    String courseName;
    int courseFee;
    void displayCourseDetails(){

        System.out.println("CourseId" + ":-" + courseId);
        System.out.println("CourseName" + ":-" + courseName);
        System.out.println("CourseFee" + ":-" + courseFee);

    }
    static void authenticate(String username, int password){
        Scanner myCourseDetails = new Scanner(System.in);
        System.out.println("Enter Your Course Id");
        int course_Id = myCourseDetails.nextInt();

        System.out.println("Enter Your Course Name");
        String course_Name = myCourseDetails.next();

        System.out.println("Enter Your Course Fee");
        int course_Fee = myCourseDetails.nextInt();
         myCourseDetails.close();

        if(username == "Admin" && password == 1234){

            Course object = new Course();
            object.courseId = course_Id;
            object.courseName = course_Name;
            object.courseFee = course_Fee;

            object.displayCourseDetails();
        }else{
            System.out.println("Invalid Username or password");
        }

    }

    public static void main(String[] args) {
        String username = "Admin";
        int password = 1234;

        authenticate(username,password);
    }
}
