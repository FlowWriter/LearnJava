import java.util.Scanner;

public class RudeQuestions {
  public static void main(String [] args ) {
    String name, town;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next(); /* This won't blow up if you enter an integer or double.
    It will blow up if you enter spaces. */

    System.out.print( "Hi, " + name + "! What is the name of your town?" );
    town = keyboard.next();

    System.out.println( "I've heard that " + town + " is a great place to live!" );

    System.out.print( "How old are you? " );
    age = keyboard.nextInt(); /* This blows up if you enter a string or use spaces. */

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble(); //This won't blow up if you type in an integer.

    System.out.println( weight + "! Better keep that quiet!!");
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );
  }
}
