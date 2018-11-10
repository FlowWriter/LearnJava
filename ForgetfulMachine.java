import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?");
    keyboard.next(); //Won't accept a space


    System.out.println( "What is 6 multiplied by 7?" );
    keyboard.nextInt(); //Won't accept a decimal

    System.out.println( "Enter a number between 0.0 and 1.0." );
    keyboard.nextDouble(); //Won't accept a text string

    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();


  }
}
