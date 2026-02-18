import java.util.*;

class Code1
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a value");
        int a = s.nextInt();

        System.out.println("Enter b value");
        int b = s.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. AND");
        System.out.println("2. OR");
        System.out.println("3. XOR");
        System.out.println("4. NOT of AND");

        int choice = s.nextInt();

        if(choice == 1)
        {
            System.out.println("AND = " + (a & b));
        }
        else if(choice == 2)
        {
            System.out.println("OR = " + (a | b));
        }
        else if(choice == 3)
        {
            System.out.println("XOR = " + (a ^ b));
        }
        else if(choice == 4)
        {
            System.out.println("NOT(AND) = " + (~(a & b)));
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
