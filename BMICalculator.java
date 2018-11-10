import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, pounds, feet, inches, feetplus;

    System.out.print( "Your height in feet only: " );
    feet = keyboard.nextDouble();

    System.out.print( "The rest of your height in inches (if applicable): " );
    inches = keyboard.nextDouble();

    feetplus = (feet*12) + inches;

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    kg = pounds / 2.205;
    m = feetplus / 39.37;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
