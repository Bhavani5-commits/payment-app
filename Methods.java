import java.util.Scanner;

class Medium{
/*
6. Write int factorial(int n) with a loop, returning n!. Test with 5 → 120. Then test factorial(0) — 
should be 1. Does yours handle it?
7. Write boolean isPrime(int n). Test 7 (true), 10 (false), 1 (false — 1 is not prime), and 2 (true — it is). 
Those last two are the boundary cases where naive versions break. Trace them.
8. Write void printTriangle(int rows) producing your star triangle, but with the size as a parameter. Call it with 3 and 5.
9. Write int sumDigits(int n) — sumDigits(123) → 6. (Hint: % 10 gets the last digit, / 10 chops it off. Loop until n is 0. 
This is a real interview question.)
*/

    int factorial(int n){
        //check 0! condition works for code
        int res = 1;
        for(int i=1;i<=n;i++)
            {
                res*=i;  
            }
            return res;
    }

    boolean isPrime(int n){
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    void printTriangle(int rows){
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

}

class GuessGameMethods
{

    int pickSecretNumber(){
        return (int)(Math.random()*100 +1);
    }
    void hint(int guess,int secret)
    {
        if(guess<secret){
            System.out.println("Too Low..Guess Higher");
        }
        else{
            System.out.println("Too High..Guess Lower");
        }
    }

}


public class Methods {
    /*
Write int square(int n) returning n². Call it with 5 and print.
Write void greet(String name) printing "Hello, <name>!". Call it twice with different names.
Write boolean isEven(int n) returning true if n is even. Test with 4 and 7. (Remember: the condition is the answer — don't write if/else.)
Write int max(int a, int b) returning the larger. Test both orders, and test max(5, 5) — what should equal values return, and does your code do that?
Write double celsiusToFahrenheit(double c) using (c * 9/5) + 32. Test with 100 → should be 212.
    */

    int square(int n)
    {
        return n*n;
    }
    void greet(String name){
        System.out.println("Hello, "+name);
    }
    boolean isEven(int n){
        return (n%2==0);
    }
    int max(int a, int b){
        if(a>b)
            {
                return a;
            }
            else{
                return b;
            }
    }
    double celciusToFahrenheit(double c){
        return (c * (9.0/5)) +32;
    }
    public static void main(String[] args)
    {
        Methods m = new Methods();
        System.out.println(m.square(5));
        m.greet("Abbuuu");
        m.greet("Parii");
        System.out.println(m.isEven(4));
        System.out.println(m.max(4,5));
        System.out.println(m.max(10,5));
        System.out.println(m.max(5,5));
        System.out.println(m.celciusToFahrenheit(100));

        Medium med = new Medium();
        System.out.println(med.factorial(5));
        System.out.println(med.isPrime(1));
        System.out.println(med.isPrime(2));
        System.out.println(med.isPrime(17));
        med.printTriangle(3);
        med.printTriangle(5);
        System.out.println(med.sumOfDigits(123));

        GuessGameMethods game = new GuessGameMethods();
        Scanner sc = new Scanner(System.in);
        int attempt;
        int guess;
        boolean hasWon=false;
        int secret = game.pickSecretNumber();
        for(attempt=1;attempt<=7;attempt++){
            guess = sc.nextInt();
            if(guess==secret)
            {
                hasWon=true;
                break;
            }
            else{
                game.hint(guess, secret);
            }
        }
        if(hasWon)
        {
            System.out.println("You Won!! Attempts : "+attempt);
        }
        else{
            System.out.println("You Lose!! the number was : "+secret);
        }

    }
}
