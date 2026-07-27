public class Conditionals {
/*Declare int age. Print "Adult" if 18 or over, else "Minor". Use full if/else with braces.
Declare int num. Print whether it's positive, negative, or zero (three-way — you'll need else if).
Rewrite problem 1 using the ternary operator in one line.
Declare int marks = 75. Print the letter grade using an if/else if/else ladder (A ≥ 90, B ≥ 80, C ≥ 70, else F). Predict the output before running.
Declare int month (1–12). Use a switch to print the season, 
roughly: 12/1/2 → Winter, 3/4/5 → Spring, 6/7/8 → Summer, 9/10/11 → Fall. 
(Hint: multiple case labels can share one block — case 12: case 1: case 2: then the code. Try it.) */
    
public static void main(String[] args){
    int age=21;
    if(age>=18)
    {
        System.out.println("Adult");
    }
    else{
        System.out.println("Minor");
    }
    int num=13;
    if(num>0)
    {
        System.out.println("positive");
    }
    else if(num<0)
    {
        System.out.println("negative");
    }
    else{
        System.out.println("zero");
    }

     String res = (age >=18)?"Adult":"Minor";
     System.out.println(res);

    int marks = 75;
   if(marks>=90)
   {
    System.out.println("A");
   }
   else if(marks>=80)
   {
    System.out.println("B");
   }
   else if(marks>=70)
   {
    System.out.println("C");
   }
   else
   {
    System.out.println("F");
   }
   int month =5;
   switch(month){
    case 12: case 1: case 2:
        System.out.println("Winter");
        break;
    case 3: case 4: case 5:
        System.out.println("Spring");
        break;
    case 6: case 7: case 8:
        System.out.println("Summer");
        break;
    case 9: case 10: case 11:
        System.out.println("Fall");
        break;
    default:
        System.out.println("invalid");
   }

   /*
   6. A login check: declare String correctPin = "1234" and String enteredPin = "1234". Print "Access granted" or "Access denied". 
   Trap: think hard about which comparison to use for Strings — this is where the == vs .equals() rule earns its keep. Try == first, see what happens, then try .equals(). Tell me what differed and what you think is going on.
7. FizzBuzz-lite: declare int n. If n is divisible by both 3 and 5, print "FizzBuzz"; if only by 3, "Fizz"; if only by 5, "Buzz"; 
else print n. (You'll need % and careful ladder ordering — think about which condition must come first, and why.)
    */
   String correctPin = "1234";
   String enteredPin = "1234";
   if(correctPin.equals(enteredPin))
   {
    System.out.println("Access Granted");
   }
   else{
    System.out.println("Access Denied");
   }

   String typedPin = new String("1234");

System.out.println(correctPin == enteredPin);
// true:  plain literal like "1234" twice, Java optimizes: it keeps a cache called the String pool, sees "1234" already exists, and points both variables at the same pooled object. Same address → == says true
System.out.println(correctPin.equals(enteredPin)); 
System.out.println(correctPin == typedPin);
// new String("1234") is an explicit order: build me a brand-new object. Java obeys, allocates a fresh slot, and typedPin gets a different address. Same letters, different slot → == says false.
System.out.println(correctPin.equals(typedPin)); 

   int n=15;
   if(n%3==0 && n%5==0)
   {
    System.out.println("FizzBuzz");
   }
   else if(n%3==0)
   {
    System.out.println("Fizz");
   }
   else if(n%5==0)
   {
    System.out.println("Buzz");
   }
   else
   {
    System.out.println(n);
   }
/*
Write a tiny "triangle validity" checker: given three int side lengths a, b, c, print whether they can form a valid triangle.
(Rule: a triangle is valid if the sum of any two sides is greater than the third — so a+b > c AND b+c > a AND a+c > b.) 
Test it with 3, 4, 5 (valid) and 1, 2, 10 (invalid). Predict both before running and explain your reasoning.
*/

int a=3,b=4,c=5;
if((a+b)>c && (b+c)>a && (c+a)>b)
{
    System.out.println("Valid");
}
else{
    System.out.println("Invalid");
}

}
   
}
