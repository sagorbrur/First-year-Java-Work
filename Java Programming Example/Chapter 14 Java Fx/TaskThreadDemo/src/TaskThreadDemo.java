
public class TaskThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable printA=new PrintChar('a',100);
		Runnable printB=new PrintChar('b',100);
		Runnable Print100=new PrintNum(100);
		
		Thread t1=new Thread(printA);
		Thread t2=new Thread(printB);
		Thread t3=new Thread(Print100);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
class PrintChar implements Runnable{
	private char charToPrint;
	private int times;
	
	public PrintChar(char c,int t){
		charToPrint=c;
		times=t;
	}
	@Override
	public void run(){
		for(int i=0;i<times;i++){
			System.out.print(charToPrint);
		}
	}
}
class PrintNum implements Runnable{
	private int lastName;
	
	public PrintNum(int n){
		lastName=n;
	}
	@Override
	public void run(){
		for(int i=1;i<=lastName;i++){
			System.out.print(" " + i);
		}
	}
}
