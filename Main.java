public class Main {
    int z;

    public Main() { //this is a constructor and it does not have a return type, just like void
        z = 100; //it is basically used to initialize attributes declared in the main class
        //it can take in parameters
    }
    public static void main(String[] args) {
        //primitive data types => byte, short, int, long, float, double, boolean and char
        //Non-primitive data types => String, Arrays, Classes
        //int ten = 10;
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        boolean myBool = true;
        int x = 5, y = 6, z = 50;
        int result = myInt * x;
        String fristname = "John ";
        String lastname = "Doe";
        String fullname = fristname + lastname;
        final int ten = 40;
        System.out.println("Hello world");
        System.out.println("I am learning Java");
        System.out.println("Your output is " + (ten + 2));
        System.out.println(fullname);
        System.out.println(x + y + z);
        System.out.println(myBool);
        System.out.println(myInt);
        System.out.println(result);
    };
}