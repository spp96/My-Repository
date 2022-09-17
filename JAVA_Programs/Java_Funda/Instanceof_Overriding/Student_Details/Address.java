package Question_1;

public class Address {
     String city;
     String state;
     String pinCode;

     public Address(String city, String state, String pinCode) {
          this.city = city;
          this.state = state;
          this.pinCode = pinCode;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public String getState() {
          return state;
     }

     public void setState(String state) {
          this.state = state;
     }

     public String getPinCode() {
          return pinCode;
     }

     public void setPinCode(String pinCode) {
          this.pinCode = pinCode;
     }

     @Override
     public String toString() {
          return "Address[" +
                  "city='" + city + '\'' +
                  ", state='" + state + '\'' +
                  ", pinCode='" + pinCode + '\'' +
                  ']';
     }
}
