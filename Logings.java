package java_oops_tasks;
//task 10

interface Logger 
{
    default void logInfo()
    {
        System.out.println("This is a default log message.");
    }

    static void logError()
    {
        System.out.println("This is a static error log.");
    }
}
class AppLogger implements Logger {
    
}
public class Logings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppLogger logger=new AppLogger();
		logger.logInfo();
		Logger.logError();
	}

}
