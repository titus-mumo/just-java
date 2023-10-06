public class Methods {
    public static void main(String[] args) {
        Methods main = new Methods();
        System.out.println(main.findArea(3));
        checkAge(22);
        System.out.println(sum(10));
        Methods myMethod = new Methods();
        System.out.println(myMethod.y);
    }
    public int findArea(int side) {
        int area = side * side;
        return area;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Not of legal age");
        } else {
            System.out.println("He can feed himself");
        }
    }

    int y = 4;

    static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}
