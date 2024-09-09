// Taking paragraph as input in java.

import java.util.Scanner;

public class TakingParaAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paragraph!");
        String str = sc.nextLine();
        System.out.println("Paragraph is: "+str);
        sc.close();
    }
}
