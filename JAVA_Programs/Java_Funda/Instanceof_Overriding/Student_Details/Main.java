package Question_1;

public class Main {
    public static Person generatePerson(Person person){

        return person;

    }


    public static void main(String[] args) {

        Address address_details = new Address("Chennai","TN","60001");

        Address address_details1 = new Address("Chennai","TN","60001");


        Person newStudent = generatePerson(new Student("XYZ","Male",address_details,1,"JA111",300000));
        Person newInstructor = generatePerson(new Instructor("Avinash","Male",address_details1,456,45612));



        System.out.println(newStudent);
        System.out.println("address= "+address_details);



        System.out.println(newInstructor);
        System.out.println("address= "+ address_details1);
    }

}
