package Question_7;

public class Thread_2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			String thread_2Name = Thread.currentThread().getName();
			System.out.println(thread_2Name+"is Thread_2" +i);
			
			System.out.println("Priority of "+thread_2Name + "is"+ " "+Thread.currentThread().getPriority());
		}
		
	}

}
