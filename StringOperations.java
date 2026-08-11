public class StringOperations {
    public static void main(String[] args) {

        String s = "Hello World";

        // 1. length() - Find length
        System.out.println("1. Length: " + s.length());

        // 2. charAt() - Get character
        System.out.println("2. Character: " + s.charAt(0));

        // 3. equals() - Compare strings
        System.out.println("3. Equals: " + s.equals("Hello World"));

        // 4. toUpperCase() - Convert to uppercase
        System.out.println("4. Uppercase: " + s.toUpperCase());

        // 5. toLowerCase() - Convert to lowercase
        System.out.println("5. Lowercase: " + s.toLowerCase());

        // 6. substring() - Extract part of string
        System.out.println("6. Substring: " + s.substring(6));

        // 7. contains() - Check if text exists
        System.out.println("7. Contains: " + s.contains("World"));

        // 8. indexOf() - Find position
        System.out.println("8. Index: " + s.indexOf("World"));

        // 9. replace() - Replace text
        System.out.println("9. Replace: " + s.replace("World", "Java"));

        // 10. split() - Split string
        String[] words = s.split(" ");

        System.out.println("10. Split:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
