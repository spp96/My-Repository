package Question_2;
import java.util.*;
public class StudentMap {
    public static void main(String[] args) {
        Map<StudentBean , String> studentTreeDetails = new TreeMap<StudentBean, String>(new SortMarks());
        studentTreeDetails.put(new StudentBean(1,"Ram",480),"Maharashtra");
        studentTreeDetails.put(new StudentBean(2,"Ronny",360),"Goa");
        studentTreeDetails.put(new StudentBean(3,"Abdul",420),"Hyderabad");
        studentTreeDetails.put(new StudentBean(4,"Allu",380),"Tamil Nadu");
        studentTreeDetails.put(new StudentBean(5,"Gaurav",440),"Madhya Pradesh");
        studentTreeDetails.forEach((key, value) ->System.out.println( key + ":- " + value));
    }
}


class SortMarks implements Comparator<StudentBean>{
    public int compare(StudentBean x, StudentBean y){
        return x.marks - y.marks;
    }
}