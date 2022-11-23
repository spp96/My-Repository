package Question_7;

public class Main {
	public static void main(String[] args) {
		
		Thread_1 firstName = new Thread_1();
		Thread firstName_a = new Thread(firstName);
		firstName_a.setName("Dhoni's Thread ");
		
		Thread secondName_b = new Thread(secondName); 

// 		Both Threads Are Running One Same Object of thread_1
		secondName_b.setName("Kohli's Thread ");
		
		firstName_a.setPriority(8);
		secondName_b.setPriority(10);
		
		firstName_a.start();
		secondName_b.start();

	}

}
