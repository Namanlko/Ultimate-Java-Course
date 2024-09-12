// Question 6: Write a program to find out the type of website from the url.

// .com  ->  Commercial Website
// .org  ->  Organization Website
// .in   ->  Indian Website

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website URL :)");
        String web = sc.nextLine();

        if(web.endsWith(".com")){
            System.out.println("Commercial Website!");
        }
        else if(web.endsWith(".org")){
            System.out.println("Organization Website!");
        }
        else if(web.endsWith(".in")){
            System.out.println("Indian Website!");
        }
        else{
            System.out.println("Invalid URL!!");
        }

        sc.close();

    }
}
