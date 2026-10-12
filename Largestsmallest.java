AIM:-
To write a Java program to find the sum, largest, and smallest numbers in a given array.

ALGORITHM:-
1. Start the program.
2. Initialize an array and set sum = 0, min, and max.
3. Traverse the array using a for loop.
4. Calculate the sum and find the largest and smallest elements.
5. Display the sum, largest, and smallest numbers.
6. Stop the program.

PROGRAM:-
public class Largestsmallest
{
public static void main (String[] args)
{
int a [] = new int [] {23,34,13,64,72,90,10,9,27};
int sum = 0;
int min = a[0];
int max = a[0];
for (int i=1; i < a.length;i++)
{
if (a[i] > max)
{
max = a[i];
}
if (a[i]<min)
{
min = a[i];
}
sum = sum+a[i];
}
System.out.println("the sum is:"+sum);
System.out.println("largest number in a given array is:"+max);
System.out.println("smallest number in a given array is:"+min);
}
}

OUTPUT:-
  the sum is:342
largest number in a given array is:90
smallest number in a given array is:9

RESULT:-
  Thus, the Java program was executed successfully to find the sum, largest, and smallest numbers in the given array.
