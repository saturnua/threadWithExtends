package myPack;

public class MyThread extends Thread{

	@Override
	public void run()	
	{
		System.out.println("Побочный поток завершен....");
	}
}
