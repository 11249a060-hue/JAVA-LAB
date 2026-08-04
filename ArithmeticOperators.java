import java.util.Scanner;
public class ArithmeticOperators
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.println(" ");
            System.out.println("Enter the two number to perform operations");
            System.out.println("Enter the first number:");
            int x = s.nextInt();
            System.out.println("Enter the second number:");
            int y = s.nextInt();
            System.out.println("Choose the operations you want to perform");
            System.out.println("Choose 1 for Addition");
            System.out.println("Choose 2 for Subtraction");
            System.out.println("Choose 3 for Multiplication");
            System.out.println("Choose 4 for Division");
            System.out.println("Choose 5 for Modulus");
            System.out.println("Choose 6 for Exit");
            int n = s.nextInt();
            switch(n)
            {
            case 1:
                int add;
                add = x + y;
                System.out.println("Result:"+ add);
                break;
            case 2:
                int sub;
                sub = x - y;
                System.out.println("Result:"+ sub);
                break;
            case 3:
                int mul;
                mul = x * y;
                System.out.println("Result:"+ mul);
                break;
            case 4:
                float div;
                div = (float) x / y;
                System.out.println("Result:"+ div);
                break;
            case 5:
                int mod;
                mod = x % y;
                System.out.println("Result:"+ mod);
                break;
            case 6:
                System.exit(0);

            }
        
        }
    }
}