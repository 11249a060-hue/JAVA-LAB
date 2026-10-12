AIM:-
To write a Java program to check whether a given year is a leap year or not.

ALGORITHM:-
1. Start the program.
2. Read a year from the user.
3. If the year is divisible by 400, it is a leap year.
4. Otherwise, if divisible by 100, it is not a leap year.
5. Otherwise, if divisible by 4, it is a leap year.
6. Display whether the year is a leap year or not.
7. Stop the program.

PROGRAM:-
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any year:");
        int  year = s.nextInt();
        boolean flag = false;
        if(year % 400 ==0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if (year % 4 == 0)
        {
            flag = true;
        } else {

            flag = false;
        }
        if(flag)
        {
        System.out.println("Year" + year + "is a leap year"); 
        }
        else
            {
         System.out.println("Year" + year + "is not a leap year"); 
        }  
        }
        }

OUTPUT:-
    Enter any year:2024
Year2024is a leap year

RESULT:-
    Thus, the Java program was executed successfully to check whether a given year is a leap year or not.
