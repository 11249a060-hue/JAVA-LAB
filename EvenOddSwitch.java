AIM:-
To write a Java program to check whether a given number is even or odd using a switch statement.

ALGORITHM:-
1. Start the program.
2. Import the Scanner class.
3. Read an integer from the user.
4. Calculate the remainder when the number is divided by 2.
5. Use a switch statement to check the remainder.
6. If the remainder is 0, display “This number is even”.
7. If the remainder is 1, display “This number is odd”.
8. Stop the program.

PROGRAM:-
import java.util.Scanner;
public class EvenOddSwitch {
    public static void main(String[] args)
{
    int n,i;
    Scanner s =new Scanner(System.in);
    n = s.nextInt();
    switch (n % 2) {
        case 0:
            System.out.println("This number is even");
            break;
        case 1:
            System.out.println("This number is odd");
            break;
    
    }
}
}

OUTPUT:-
    8
This number is even

RESULT:- Thus, the Java program was executed successfully to check whether a given number 
    is even or odd using a switch statement.
