public class Main {
    public static void main(String[] args) {
        int time = 12;
        String timeday = "not defined";

        if (time == 6 || time == 7 || time == 8 || time == 9 || time == 10 || time == 11 || time == 12) {
            System.out.println("Morning");
        }
        else if (time == 13 || time == 14 || time == 15 || time == 16 || time == 17 || time == 18 || time ==19) {
            System.out.println("Day");
        }
        else if (time == 20 || time == 21 || time == 22 || time == 23 || time == 24|| time == 1 || time == 2 || time == 3 || time == 4 || time == 5) {
            System.out.println("Night");
        } else {
            System.out.println("Day have only 24 hours");
        }
    }
}
