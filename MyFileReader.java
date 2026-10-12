AIM:-
To write a Java program to read and display the contents of a text file using the FileReader class.

ALGORITHM:-
1. Start the program.
2. Open the file sample2.txt using FileReader.
3. Read the file character by character until the end of the file.
4. Display the contents on the screen.
5. Close the file.
6. Handle exceptions using a catch block.
7. Stop the program.

PROGRAM:-
import java.io.*;

class MyFileReader { 
    public static void main(String[] args) {
        try { // Changed to lowercase 'try'
            FileReader fr = new 
            FileReader("sample2.txt");
            int i;
            // Fixed the parentheses around fr.read()
            while ((i = fr.read()) != -1) { 
                System.out.print((char) i); // Use print instead of println to read naturally
            }
            fr.close();
        } catch (Exception e) {
            System.err.println("Exception: " + e);
        }
    }
    
}

OUTPUT:-
A B C D E F G H I J K L
M N O P Q R
S T U V W X Y Z

RESULT:-
Thus, the Java program was executed successfully to read and display the contents of a text file using the FileReader class.
