// Exercise 2: Rock, Paper Scissors Game.

import java.util.Scanner;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice 1 For: Rock, 2: For Paper, 3 For: Scissors -)");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Match is Draw!");
            System.out.println("You Chose: "+userInput);
            System.out.println("Computer Chose: "+computerInput);
        }

        else if((userInput==2 && computerInput==1) || (userInput==3 && computerInput==2) || (userInput==1 && computerInput==3) ){
            System.out.println("You Won!");
            System.out.println("You Chose: "+userInput);
            System.out.println("Computer Chose: "+computerInput);
        }
        else{
            System.out.println("Computer Won!");
            System.out.println("You Chose: "+userInput);
            System.out.println("Computer Chose: "+computerInput);
        }

        sc.close();
    }
}
