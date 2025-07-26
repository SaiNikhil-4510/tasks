package myproject;

//task 7.2 

public class Uninstilize_Variables {
    // Instance variables without initialization
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str;

    public static void main(String[] args) {
        Uninstilize_Variables obj = new Uninstilize_Variables();

        System.out.println("byte: " + obj.b);
        System.out.println("short: " + obj.s);
        System.out.println("int: " + obj.i);
        System.out.println("long: " + obj.l);
        System.out.println("float: " + obj.f);
        System.out.println("double: " + obj.d);
        System.out.println("char: [" + obj.c + "]");
        System.out.println("boolean: " + obj.bool);
        System.out.println("String: " + obj.str);
    }
}




