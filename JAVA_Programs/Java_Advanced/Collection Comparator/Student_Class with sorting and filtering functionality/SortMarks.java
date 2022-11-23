package Question_3;

import java.util.Comparator;

public class SortMarks implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if (s1.getMarks()>s2.getMarks())
			return +1;
		else if (s1.getMarks()<s2.getMarks())
			return -1;
		else
			return s1.getName().compareTo(s2.getName());
	}
}
