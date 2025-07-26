package MultiThreading_tasks;

//task 2

public class RunnableCounter implements Runnable {
	@Override
    public void run()
	{
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Thread is interrupted:" + ex.getMessage());
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread counterThread = new Thread(new RunnableCounter());
        counterThread.start(); 
	}

}

