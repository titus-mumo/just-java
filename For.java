public class For {
    public static void main(String[] args) {
        int n = 6;
        int i = 1;

        for (int x = 1; x <= n; x++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 6; x >= i; x--) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
