Aim:
To write a Java program to check whether a number is an Armstrong number.

Algorithm:
1. Read a positive number from the user.
2. Store the number in a temporary variable.
3. Extract each digit and calculate the sum of the cubes of its digits.
4. Compare the sum with the original number.
5. Display whether it is an Armstrong number or not.

Program:
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        
        int n , nu, num =0, rem;
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter any positive number: ");
    n = sc.nextInt();
    nu = n;
    while(nu != 0)
        {
        rem = nu % 10;
        num = num + (rem * rem * rem);
        nu = nu / 10;
    }
    if(num == n)
        System.out.println(n + " is an Armstrong number.");
    else
        System.out.println(n + " is not an Armstrong number.");
}
}

Output:
Enter any positive number:
153
153 is an Armstrong number.

Result:
Thus, the Java program to check whether a number is an Armstrong number was executed successfully.
