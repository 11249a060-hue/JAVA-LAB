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