package java_tasks_exception;
//task 2.2

interface RemoteControl1 {
    void turnOn();

    default void displayMode() {
        System.out.println("Battery is 80% charged.");
    }

    static void showCompany() {
        System.out.println("Company: GadgetPlus");
    }
}

class Television1 implements RemoteControl1 {
    @Override
    public void turnOn() {
        System.out.println("Television is now ON.");
    }

}

public class Static {
    public static void main(String[] args) {
        RemoteControl1.showCompany();

        RemoteControl1 tv = new Television1();
        tv.turnOn();
        tv.displayMode();
    }
}


