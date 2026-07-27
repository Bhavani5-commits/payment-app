public class Loops {
    public static void main(String[] args)
    {
        /*
        Print numbers 1 to 10 using a for loop.
Print numbers 10 down to 1 using a for loop. (Think: what changes in init, condition, and update?)
Print only the even numbers from 1 to 20. Two ways — try it with % inside an if, then again with a smarter update step. Which is better and why?
Sum the numbers 1 to 100 and print the total. (Declare int sum = 0 before the loop, add to it each round.) Predict the answer first — there's a famous formula, but reason it out.
Print the 7 times table: 7 x 1 = 7 through 7 x 10 = 70.
        */

    for(int num =1;num<=10;num++)
    {
        System.out.println(num);
    }
    for(int num =10;num>=1;num--)
    {
        System.out.println(num);
    }
    for(int num =1;num<=20;num++)
    {
        if(num%2==0)
        {
             System.out.println(num);
        }
    }
    for(int num=2;num<=20;num+=2) //this is better because number of iteration ar eless but same output ,which reduced time complexity
        {
         System.out.println(num);  
    }
    int sum=0;
    for(int i=1;i<=100;i++)
    {
        sum+=i;
    }
     System.out.println(sum);

     for(int i=1;i<=10;i++)
     {
         System.out.println("7 x "+i+" = "+(7*i));
     }

     /*
     6. Rewrite problem 1 using a while loop instead. Then again with do-while. Same output, three loops — this proves you see they're the same machine.
7. Count how many even numbers are between 1 and 50 using a loop and a counter.
8. Full FizzBuzz: loop 1 to 20 and apply your FizzBuzz-lite logic from Lesson 5 to each number.
(This is the most famous interview screening question in existence. You already have the logic — now you're putting it in a loop.)
9. Given int n = 5, compute its factorial (5 × 4 × 3 × 2 × 1 = 120) with a loop. (Hint: start int result = 1, not 0 — reason about why 0 would break it.)

     */
    int n =1;
    while(n<=10)
    {
        System.out.println(n);
        n++;
    }
    n=1;
    do{
        System.out.println(n);
        n++;
    }while(n<=10);
    int c=0;
    for(int i=1;i<=50;i++){
        if(i%2==0)
            c++;
    }
    System.out.println(c);
//8.fizzbuzz
    for(int i=1;i<=20;i++)
    {
        if(i%3==0 && i%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(i%3==0)
        {
            System.out.println("Fizz");
        }
        else if(i%5==0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(i);
        }
    }
    int f=1,fac=5;
    for(int i=1;i<=fac;i++)
    {
        f*=i;
    }
    System.out.println(f);

    /*
    Difficult (try 1):
10. Print this triangle using nested loops (a loop inside a loop):
*
**
***
****
*****
    */
   for(int i=0;i<5;i++)
   {
    for(int j=0;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
   }

    }
    
}
