package myPack;

public class Main {

	static MyThread secondThread;
	
	public static void main(String[] args)
	{
		secondThread = new MyThread();	
		secondThread.start();					
		
		System.out.println("Главный поток завешен...");
	}
}
