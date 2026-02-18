import java.util.*;
class Code2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = s.nextInt();

        String result = (score >= 90 && score <= 100) ? "A" :(score >= 80 && score < 90) ? "B" :(score >= 70 && score < 80) ? "C" :
                        (score >= 60 && score < 70) ? "D" :(score < 60) ? "F" : "Invalid";

        System.out.println(result);
    }
}
