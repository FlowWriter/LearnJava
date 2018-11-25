import java.util.Scanner;
import java.io.PrintWriter;

public class ReceiptRevisited {
  public static void main( String[] args ) throws Exception {
    PrintWriter fileout = new PrintWriter("receipt.txt");
    double ppg = 2.3945, totalprice;
    int humanwants;

    Scanner keyboard = new Scanner(System.in);

    System.out.println( "How many gallons of gas do you want to buy? " );
    humanwants = keyboard.nextInt();

    totalprice = humanwants * ppg;

    fileout.println( "+------------------------+" );
    fileout.println( "|                        " );
    fileout.println( "|       CORNER STORE     " );
    fileout.println( "|                        " );
    fileout.println( "|  2014-06-25   4:38pm   " );
    fileout.println( "|                        " );
    fileout.println( "|  Gallons: " + humanwants );
    fileout.println( "|  Prince/gallon: $2.3945 " );
    fileout.println( "|                        " );
    fileout.println( "|  Fuel total: " + totalprice );
    fileout.println( "|                        " );
    fileout.println( "+------------------------+" );
    fileout.close();
  }
}
