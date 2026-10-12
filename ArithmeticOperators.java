AIM:-
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a switch statement.

ALGORITHM:-
1. Start the program.
2. Create a Scanner object to read input from the user.
3. Read two numbers from the user.
4. Display the menu of arithmetic operations.
5. Read the user's choice.
6. Use a switch statement to perform the selected operation.
7. Display the result of the operation.
8. Repeat the process until the user chooses Exit.
9. Stop the program.

PROGRAM:-
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

OUTPUT:-
Enter the two number to perform operations
Enter the first number:
10
Enter the second number:
5
Choose the operations you want to perform
Choose 1 for Addition
Choose 2 for Subtraction
Choose 3 for Multiplication
Choose 4 for Division
Choose 5 for Modulus
Choose 6 for Exit
1
Result:15

RESULT:-Thus, the Java program was executed successfully to perform addition,
    subtraction, multiplication, division, and modulus operations using a switch statement.
