package MultiThreading_tasks;

//task 1
public class MyPrinterThread extends Thread {
	@Override
    public void run()
	{
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hello from Thread.........");
            try
            {
                Thread.sleep(1000); 
            } catch (InterruptedException ex) 
            {
                System.out.println("Thread got interrupted.");
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPrinterThread thread = new MyPrinterThread();
        thread.start(); 
	}

}

