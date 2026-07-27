// Mini Project
//The goal: the computer picks a secret number; the user guesses until they get it; the program says "too high" or "too low" each time and counts attempts.
import java.util.Scanner;

public class Guessgame {


    static int pickSecretNumber(){
        return (int)(Math.random()*100 +1); //Math.random() gives a double between 0.0 and 1.0. Multiply by 100 → 0.0–99.99. (int) is a cast — it forces the double into an int, truncating the decimal Then + 1 shifts the range to 1–100.
    }
    static void hint(int guess,int secret)
    {
        if(guess<secret){
            System.out.println("Too Low..Guess Higher");
        }
        else{
            System.out.println("Too High..Guess Lower");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int secretNum = pickSecretNumber(); 
        boolean hasWon=false;
        int attempt;
        for(attempt =1;attempt<=7;attempt++)
        {
            System.out.println("Enter Your Guess: ");
            int guess=sc.nextInt();
            if(guess==secretNum)
            {
                 hasWon=true;
                 break;
            }
            else{
                hint(guess, secretNum);
            }
        }
        if(hasWon)
              {
                System.out.println("You Won!! Attempts total : "+attempt);
              }
        else
            {
                System.out.println("You lose! The number was "+secretNum);
            }
        sc.close();

    }

    
}

/*
WE CAN MINIMIZE CODE IN MAIN METHOD LIKE BELOW # ALTERNATIVE

static int playGame(Scanner scanner, int secret, int maxAttempts) {
    for (int attempt = 1; attempt <= maxAttempts; attempt++) {
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();
        if (guess == secret) {
            return attempt;      // won — hand back HOW MANY tries
        }
        giveHint(guess, secret);
    }
    return -1;                   // lost — a value that can't be a real attempt count
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int secret = pickSecretNumber();
    int result = playGame(scanner, secret, 7);

    if (result == -1) {
        System.out.println("You lose! The number was " + secret);
    } else {
        System.out.println("You won! Attempts: " + result);
    }
    scanner.close();
}

*/
