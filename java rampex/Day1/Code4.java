import java.util.Scanner;

class Code4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int N = sc.nextInt();

        // Check Leap Year and Print
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");

            if (N > 366 || N <= 0) {
                System.out.println("Invalid Day");
                return;
            }

        } else {
            System.out.println("Common Year");

            if (N > 365 || N <= 0) {
                System.out.println("Invalid Day");
                return;
            }
        }

        // Day of Week Calculation
        int index = (N - 1) % 7;

        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        System.out.println(days[index]);

        sc.close();
    }
}