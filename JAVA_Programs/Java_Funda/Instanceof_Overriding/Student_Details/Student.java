package Question_1;

public class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;

    public Student(String name, String gender, Address address, int studentId, String courseEnrolled, int courseFee) {
        super(name, gender, address);
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "Student[" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                ']';
    }
}
