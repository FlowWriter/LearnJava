import java.util.Scanner;

public class ItemNotFound {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {
      "Abderbus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
      "Bellerephon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
      "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
      "Mealeager", "Odysseus", "Orpheus", "Perseus", "Theseus"
    };
    String guess;
    boolean found;

    System.out.println( "Pop Quiz!" );
    System.out.print( "Name any *mortal* hero from Greak mythology: " );
    guess = keyboard.next();

    found = false;
    for ( String hero: heroes ) {
      if ( guess.equals(hero) ) {
        System.out.println( "That's one of them!" );
        found = true;
      }
    }

    if (found == false ) {
      System.out.println(" No, " + guess + " wasn't a Greek mortal hero." );
    }
  }
}
