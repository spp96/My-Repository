package Question_1;

public class Person {
    String name;
    String gender;
    Address address;

    public Person(String name, String gender, Address address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ']';
    }
}
