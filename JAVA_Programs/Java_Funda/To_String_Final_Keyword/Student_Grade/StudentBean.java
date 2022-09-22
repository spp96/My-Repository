package Question_1;

public class StudentBean {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public StudentBean(int roll, String name, int marks, char grade) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }
}
