// Here we will learn about different methods uesd in Strings.

// String methods operates on Java strings. They can be used to find length of the string, convert to lowercase etc.

public class StringMethods {
    public static void main(String[] args) {
        
        String str = "Harry";

        // Method 1. length()
        // Return the length (size) of a String.
        System.out.println(str.length());

        // Method 2. toLowerCase()
        // Return new String after converting given string into lowercase.
        System.out.println(str.toLowerCase());

        // Method 3. toUpperCase()
        // Return new String after converting given string into uppercase.
        System.out.println(str.toUpperCase());

        // Method 4. trim()
        // Return new String after removing leading and trailing spaces from the given string.
        String str4 = "    Hello, Harry This Side!   "; 
        System.out.println(str4.trim());

        // Method 5. substring(int start)
        // Return new sub String from start to end. 
        System.out.println(str.substring(1)); // Here Substring Start from Index 1.

        // Method 6. substring(int start, int end)
        // Return new sub String from start to end. 
        System.out.println(str.substring(1,4)); // Here Substring Start from Index 1 and end at index 4 (Last Index is Not Included).

        // Method 7. replace('old','new')
        // Return new String after replacing old with new. 
        System.out.println(str.replace('r','p')); 

        // Method 8. startsWith("SubString")
        // Return true if the String starts with mentioned sub string. 
        System.out.println(str.startsWith("Ha")); 

        // Method 9. endsWith("SubString")
        // Return true if the String ends with mentioned sub string. 
        System.out.println(str.endsWith("rry"));
        
        // Method 10. charAt(index)
        // Return the character present at given index. 
        System.out.println(str.charAt(3));

        // Method 11. indexOf(character)
        // Return the index of the given character. 
        System.out.println(str.indexOf('H'));

        // Method 12. indexOf(character, Starting Index)
        // Return the index of the given character. 
        System.out.println(str.indexOf('r',3));

        // Method 13. lastIndexOf(character)
        // Return the index from last of the string of the given character. 
        System.out.println(str.lastIndexOf('r'));

        // Method 14. lastIndexOf(character, Starting Index from Last)
        // Return the index from last of the string of the given character. 
        System.out.println(str.lastIndexOf('r',3));

        // Method 15. equals(String)
        // Return the true if the actual String and mentioned String both are same. 
        System.out.println(str.equals("Harry"));

        // Method 16. equalsIgnoreCase(String)
        // Return the true if the actual String and mentioned String both are same ignoring case. 
        System.out.println(str.equalsIgnoreCase("harry"));

    }
}
