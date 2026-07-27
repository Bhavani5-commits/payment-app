public class Operators {
    public static void main(String[] args) {
        /*
        Declare int x = 23. Print whether it's even using %. (Hint: x % 2 — what value means even?)
Declare two ints and print all six comparisons: >, <, >=, <=, ==, !=.
Declare boolean hasTicket = true and boolean hasID = false. Print whether the person can board (needs both).
Start with int score = 100. Use -= to subtract 30, then print. Then ++ it and print again.
Predict then print: what does "Result: " + 5 + 3 give? Then what does "Result: " + (5 + 3) give? 
Explain the difference in one line. */
        int x=23;
        if(x%2==0)
            System.out.println("even");
        int a=5,b=2;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        boolean hasTicket=true;
        boolean hasID = false;
        if(hasTicket && hasID)
            System.out.println("can board");
        else
            System.out.println("cannot board");
        int score=100;
        score-=30;
        System.out.println(score);
        score++;
          System.out.println(score);
        System.out.println("Result: " +5+3);
        System.out.println("Result: " +(5+3));
    /*6. A store gives free shipping if the order is over $50 or the customer is a member. 
    Declare double orderTotal = 45.0 and boolean isMember = true, then print a boolean for whether they get free shipping.
7. Convert int minutes = 200 into hours and leftover minutes using / and %. 
Print like 3 hours and 20 minutes. (This is the classic / and % combo — think about which gives you hours and which gives leftover.)
8. Declare int age = 25. Print a boolean for whether the person is a "young adult," defined as age >= 18 and age < 30. 
(You'll need &&.)
Difficult (try 1):
9. Given int n = 7, print true if n is odd and greater than 5, using a single boolean expression with %, != (or ==), >, and && combined. 
Predict the result before running, and tell me your reasoning for how the expression evaluates.
*/
        double orderTotal=45.0;
        boolean isMember = true;
        if(orderTotal > 50 || isMember)
            System.out.println(true);
        else
            System.out.println(false);
        int minutes=200;
        int hrs=minutes/60;
        int mins=minutes%60;
        System.out.println(hrs+" hours"+" and "+mins+" minutes");
        int age =25;
        boolean youngAdult=(age>=18 && age<30);
        System.out.println(youngAdult);
        int n=7;
        boolean y = (((n%2)!=0)&&(n>5));
        System.out.println(y);

    }
}
