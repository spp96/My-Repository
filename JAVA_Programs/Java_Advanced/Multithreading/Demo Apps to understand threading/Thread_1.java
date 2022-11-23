package Question_7;

public class Thread_1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			String thread_1Name = Thread.currentThread().getName();
			System.out.println(thread_1Name +" is Thread_1" +i);
			
			System.out.println("Priority of "+thread_1Name + "is"+ " "+Thread.currentThread().getPriority());
		}
		
	}

}
