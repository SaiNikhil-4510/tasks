package MultiThreading_tasks;

//task 3

public class PrinterThread extends Thread {
	 @Override
	    public void run() 
	 {
	        for (int i=1;i<=5;i++)
	        {
	            System.out.println("Thread1:" +i);
	            try 
	            {
	                Thread.sleep(1000);
	            } catch(InterruptedException ex)
	            {
	                System.out.println("Thread1 got interrupted.");
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrinterThread thread1 = new PrinterThread();
        thread1.start(); 

        try
        {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException ex) 
        {
            System.out.println("Main thread interrupted while waiting.");
        }

        System.out.println("Main thread done.");
	}

}


