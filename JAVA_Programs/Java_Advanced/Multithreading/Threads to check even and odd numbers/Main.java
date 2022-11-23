package Question_3;

public class Main{
	public static void main(String[] args) {
		Thread_Even even = new Thread_Even();
		
		Thread_Odd odd = new Thread_Odd();
		
		even.start();
		try {
			even.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		odd.start();
	}

}
