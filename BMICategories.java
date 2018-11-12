import java.util.Scanner;

public class BMICategories {
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

    System.out.print( "BMI category: " );
    if (bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi <= 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
