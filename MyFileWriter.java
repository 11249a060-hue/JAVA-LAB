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
