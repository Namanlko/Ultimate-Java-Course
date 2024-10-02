import java.util.Scanner;
import java.util.Random;

class Games {
    int number;
    int noOfGuess;

    Games() {
        Random rn = new Random();
        number = rn.nextInt(100);
    }

    public int getNoOfGuess() {
        return this.noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    boolean isCorrectNumber(int userInput) {
        noOfGuess++;
        if (number == userInput) {
            System.out.format("Yes, you guessed it right! The number was %d.\nYou guessed it in %d attempts.\n", number, noOfGuess);
            return true;
        } else if (number > userInput) {
            System.out.println("Too Low!");
        } else {
            System.out.println("Too High!");
        }
        return false;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Games game = new Games();
        Scanner sc = new Scanner(System.in);
        
        boolean isCorrect = false;
        
        System.out.println("Welcome to the Guess the Number game!");
        
        while (!isCorrect) {
            System.out.print("Guess The Number (0-99): ");
            int userInput = sc.nextInt();
            isCorrect = game.isCorrectNumber(userInput);
        }
        
        sc.close();
    }
}
