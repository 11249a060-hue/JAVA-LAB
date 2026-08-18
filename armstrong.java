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