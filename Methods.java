public class Methods {
    public static void main(String[] args) {
        System.out.println(findArea(2));
        System.out.println(findArea(3));
        System.out.println(findArea(4));
        checkAge(22);
        System.out.println(sum(100));
    }
    static int findArea(int side) {
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

    static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}
