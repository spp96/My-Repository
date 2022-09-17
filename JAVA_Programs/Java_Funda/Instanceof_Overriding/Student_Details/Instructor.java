package Question_1;

public class Instructor extends Person {
    int instructorId;
    int salary;

    public Instructor(String name, String gender, Address address, int instructorId, int salary) {
        super(name, gender, address);
        this.instructorId = instructorId;
        this.salary = salary;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor[" +
                "instructorId=" + instructorId +
                ", salary=" + salary +
                ']';
    }
}
