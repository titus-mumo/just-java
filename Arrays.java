public class Arrays {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        cars[1] = "Mercedes";
        System.out.println(cars.length);
        for (int i = 0; i < cars.length; i++) {
            System.out.println("The car is " + cars[i]);
        }

        for (String i : cars) {
            System.out.println("My dream car is " + i);
        }
    }
}
