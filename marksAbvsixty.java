import java.util.Scanner;
public class marksAbvsixty
{
public static void main(String[] args)
{
int [] marks = new int[6];
int i;
String [] name= new String[30];
Scanner Scanner = new Scanner (System.in);
for (i=0 ;  i<6 ;  i++)
{
System.out.print("enter name of student and marks of subject" + (i+1)  + ":");
name[i] = Scanner.next();
marks[i] = Scanner.nextInt();
}
for (i=0 ; i<6 ; i++)
{
if (marks[i]>=60)
{
System.out.println(name[i]+ "  "+  marks[i]);
}
}
}
}