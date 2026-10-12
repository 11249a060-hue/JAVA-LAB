AIM:-
To write a Java program to find the largest of three integers using if-else-if statements.

 ALGORITHM:-
1. Start the program.
2. Read three integers x, y, and z.
3. Compare the three numbers using if-else-if.
4. Display the largest number.
5. If numbers are not distinct, display the appropriate message.
6. Stop the program.
 
 
 PROGRAM:-
 import java.util.Scanner;
 class LargestofThreeNumbers {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three integers");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x>y && x>z)
            System.out.println("first number is largest");
        else if (y>x && y>z)
            System.out.println("second number is largest");
        else if (z>x && z>y)
            System.out.println("third number is largest");
        else
            System.out.println("the number are not distint");
    }
    
}

OUTPUT:-
 Enter three integers
10
20
15
second number is largest

RESULT:-
 Thus, the Java program was executed successfully to find the largest of three integers using if-else-if statements.
