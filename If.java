public class If {
    public static void main(String[] args) {
        int day = 1;
        String number;
        number = (day == 1) ? "1" : "2";
        System.out.println("My lucky number is " + number);

        String team = "Mancity";
        if (team == "Mancity") {
            System.out.println("They won the treble");
        } else if (team == "ManU"){
            System.out.println("They won the carabao cup");
        } else {
            System.out.println("It better not be Arsenal");
        }
    }
}
