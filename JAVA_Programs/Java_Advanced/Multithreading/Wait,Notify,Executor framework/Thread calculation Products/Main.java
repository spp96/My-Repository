package Question_1;

public class Main {

	public static void main(String[] args) {
		Thread_A tr = new Thread_A();

		tr.start();
		
		synchronized (tr) {
			try {
				tr.wait();
				System.out.println("Products fom 1 to 10 is:- "+ tr.products);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
}
