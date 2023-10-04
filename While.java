public class While {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 5) {
            System.out.println("The value of x is " + x);
            x = x + 1;
        }

        do {
            System.out.println("The number is " + x);
            x = x + 1;
        } while (x > 3);
    };
}
