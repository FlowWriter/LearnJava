public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, broke;
        double seconds, e, checking, saving;
        String firstName, lastName, title, middleName, nickname;

        x = 10;
        y = 400;
        age = 39;
        broke = 4;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        saving = 500.4678743;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        middleName = "Roger";
        nickname = "GM";

        System.out.println( "The variable x contains " + x);
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds.");
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( "My savings is this much: " + saving + "." );
        System.out.println( "The computer has been repaired " + broke + " times." );
        System.out.println( "His complete name is " + firstName + " " + middleName + " " + lastName + "." );
        System.out.println( "Sometimes his friends call him " + nickname + "." );
    }
}
