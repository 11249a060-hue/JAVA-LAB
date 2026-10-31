Aim:
To search for an element in an array using binary search in Java.

Algorithm:
1. Read the number of elements and array elements.
2. Read the element to be searched.
3. Initialize first = 0 and last = n - 1.
4. Find the middle element and compare it with the search element.
5. If equal, display "element found"; otherwise, adjust first or last.
6. Display "element not found" if the element is absent.

Program:
import java.util.Scanner;
class binarysearch
{
public static void main(String [] args)
{
int i,  mid,  first,  last,  x,  n,  flag = 0;
Scanner sc =  new Scanner(System.in);
System.out.println("enter number  of elements:");
n = sc. nextInt ();
int a[] = new int [n];
System.out.println("Enter elements of array:");
for (i=0; i<n; ++i){
a[i] = sc.nextInt();
}
System.out.println("enter element to search:");
x = sc.nextInt();
first = 0;
last = n - 1;
while (first <= last)
{
mid = (first+last)/2;
if (a[mid]>x)
{
last = mid-1;
}
else if (a[mid]<x) {
first = mid+1;
}
else
{
flag = 1;
System.out.println("element found");
break;
}
}
if (flag == 0){
System.out.println("element not found");
}
}
}

Output:
enter number of elements:
5
Enter elements of array:
1 2 3 4 5
enter element to search:
3
element found

Result:
Thus, binary search was implemented successfully in Java.
