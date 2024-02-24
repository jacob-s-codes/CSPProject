import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to the conjugator!");
        String playAgain = "";
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        Conjugation c = new Conjugation();
        boolean gotIt = false;


        do {
            gotIt = false;
            System.out.println(c.getVerb());
            
            do {
                userInput = sc.next();
                if (c.check(userInput)) {
                    System.out.println("Nice job!");
                    gotIt = true;
                } else {
                    System.out.println("Try again :( )");
                }
            } while (gotIt != true);
            
            
            System.out.print("Again? ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));

    }
}