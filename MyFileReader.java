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
