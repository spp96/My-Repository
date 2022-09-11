package Q4;

public class Student_Object_Details {
    int roll;
    String name;
    int marks;
    void displayStudentDetails(){
        System.out.println("Roll No:- " + roll);
        System.out.println("Name is:- " + name);
        System.out.println("Marks is:- " + marks);

    }

    public static void main(String[] args) {
        Student_Object_Details student1 = new Student_Object_Details();
        student1.roll = 44;
        student1.name = "Ramesh";
        student1.marks = 35;
        System.out.println("********************Student1Details**********************");
        student1.displayStudentDetails();

        Student_Object_Details student2 = new Student_Object_Details();
        student2.roll = 45;
        student2.name = "Suresh";
        student2.marks = 40;
        System.out.println("********************Student2Details**********************");
        student2.displayStudentDetails();
    }
}
