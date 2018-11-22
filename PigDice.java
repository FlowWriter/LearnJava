import java.util.Scanner;

public class PigDice {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int roll, ptot, ctot, turnTotal;
    String choice = "";

    ptot = 0;
    ctot = 0;

    do {
      turnTotal = 0;
      System.out.println( "You have " + ptot + " points." );

      do { //human's turn
        roll = 1 + (int)(Math.random()*6);
        System.out.println( "\tYou rolled a " + roll + "." );
        if ( roll == 1 ) {
          System.out.println( "\tThat ends your turn." );
          turnTotal = 0;
        }
        else {
          turnTotal += roll;
          System.out.print( "\tYou have " + turnTotal + " points" );
          System.out.print( " so far this round.\n" );
          System.out.print( "\tWould you like to \"roll\" again" );
          System.out.print( " or \"hold\"? " ) ;
          choice = keyboard.next();
        }
      } while ( roll != 1 && choice.equals("roll") );

      ptot += turnTotal;
      System.out.println( "\tYou end the round with " + ptot + " points." );

//COMPUTER'S TURN

      if ( ptot < 100 ) { //only works if human has less than 100 pts
        turnTotal = 0;  //resets comp to zero
        System.out.println( "Computer has " + ctot + " points." ); //recaps overall total

        do { // computer rolls die
          roll = 1 + (int)(Math.random()*6);
          System.out.println( "\tComputer rolled a " + roll + "." );
          if ( roll == 1) { //if a one is rolled, prints this out
            System.out.println( "\tThat ends its turn." );
            turnTotal = 0;
            }
            else {
              turnTotal += roll; //adds roll to this turn's total
              System.out.print( "\tComputer has " + turnTotal );
              System.out.print( " points so far this round.\n" );

              if (turnTotal < 20 && (turnTotal + ctot != 100)) { //keeps going as long as turn is under 20
                //right here it should check if ctot is over 100
                //if the turnTotal + ctot >= 100 system print computer wins
                System.out.println( "\tComputer will roll again." );
              }
              else {
                if (turnTotal >= 20) {
                  System.out.print( "\tComputer ends the round with " );
                  System.out.print( (turnTotal + ctot) + " points.\n ");
                }
                else {
                  if ( turnTotal + ctot >= 100 ) {
                  System.out.println( "The computer wins with " + (turnTotal + ctot) + " points." );
                  }
                }
              }
            }
          } while (roll != 1 && turnTotal < 20 );//keeps comp turn unless it's a one or turn goes over 20
        ctot += turnTotal;
        }
    }  while ( ptot < 100 && ctot < 100 );

    if ( ptot > ctot ) {
        System.out.println( "Humanity wins!" );
        }
      else {
        System.out.println( "The computer wins." );
        }
  }
}
