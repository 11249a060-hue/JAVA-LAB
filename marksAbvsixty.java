Aim:
To display the names and marks of students who scored 60 or above.

Algorithm:
1. Declare arrays to store student names and marks.
2. Read the names and marks of six students.
3. Check whether each student's marks are greater than or equal to 60.
4. Display the names and marks of students who scored 60 or above.

Program:  
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

Output:
enter name of student and marks of subject1: Ravi 75
enter name of student and marks of subject2: Sita 55
enter name of student and marks of subject3: Ram 80
enter name of student and marks of subject4: Rani 45
enter name of student and marks of subject5: John 65
enter name of student and marks of subject6: Devi 50

Ravi  75
Ram  80
John  65

Result:
Thus, the program was executed successfully to display students who scored 60 or above.
