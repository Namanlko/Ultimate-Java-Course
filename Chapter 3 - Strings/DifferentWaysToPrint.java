// There are four print ways to print on output console screen.

// 1) System.out.print()
// 2) System.out.println()
// 3) System.out.printf()
// 4) System.out.format()

public class DifferentWaysToPrint {
    public static void main(String[] args) {
        
        // Method 1.
        // This will print value on console screen without channging line.
        System.out.print("Hello This is Method 1.");
        System.out.print('\n');

        // Method 2.
        // This will print value on console screen and also move to the next line.
        System.out.println("Hello This is Method 2.");

        // Method 3.
        // This will print value on console screen by mentioning format specifier.
        System.out.printf("%s","Hello This is Method 3.");
        System.out.print('\n');

        // Method 4.
        // This will print value on console screen by mentioning format specifier.
        System.out.format("%s","Hello This is Method 4.");
        System.out.print('\n');

    }
}
