AIM:-
To write a Java program to write uppercase English alphabets from A to Z into a text file using the FileWriter class.

ALGORITHM:-
1. Start the program.
2. Create a FileWriter object for sample2.txt.
3. Use a for loop to generate characters from A to Z.
4. Write each character into the file.
5. Close the file and display a success message.
6. Handle exceptions using a catch block.
7. Stop the program.

PROGRAM:-
import java.io.*;

class MyFileWriter { // Renamed to avoid class conflict
    public static void main(String[] args) {
        try { 
            // Opens or creates sample2.txt
            FileWriter fw = new FileWriter("sample2.txt");
            
            // Fixed: Removed quotes around 65 (ASCII value for 'A')
            for (char i = 65; i < 91; i++) {
                fw.write(i); 
            }
            
            fw.close(); 
           System.out.println("File written successfully");
            
        } catch (Exception e) {
            System.err.println("Exception: " + e);
        }
    }
}

OUTPUT:-
    ABCDEFGHIJKLMNOPQRSTUVWXYZ

RESULT:-Thus, the Java program was executed successfully to write uppercase alphabets from A to Z into a text file using the FileWriter class.
