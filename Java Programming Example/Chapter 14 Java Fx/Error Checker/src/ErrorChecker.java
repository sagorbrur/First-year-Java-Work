
public class ErrorChecker implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ErrorChecker();

	}
	public ErrorChecker(){
		//ErrorChecker task=new ErrorChecker();
		//new Thread(task).start(); 
		/*
		 * For 1st problem we need to delete 
		 * ErrorChecker task=new ErrorChecker();
		 * and use new Thread(this).start();
		 * For 2nd second problem we just need to delete one t.start();
		 */
		Thread t=new Thread(this);
		t.start();
		//t.start();
	}
	
	public void run(){
		System.out.println("test");
	}

}
