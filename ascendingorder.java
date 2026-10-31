Aim:
To sort array elements in ascending order using Java.

Algorithm:
1. Read the number of elements.
2. Store the elements in an array.
3. Compare each element with the remaining elements.
4. Swap elements if they are in the wrong order.
5. Display the array in ascending order.

Program:
import java.util.Scanner;

public class ascendingorder {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("enter no.of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("ascending order: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}

Output:
enter no.of elements you want in array: 5
enter all the elements:
5
2
8
1
3
ascending order: 1,2,3,5,8

Result:
Thus, the array elements were sorted in ascending order successfully.
