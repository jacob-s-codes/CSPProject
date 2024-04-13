import java.util.Scanner;

public class APCSPProject {
    private static String playAgain = "";
    private static String userInput = "";
    private static Scanner sc = new Scanner(System.in);
    private static Conjugation c = new Conjugation();
    private static boolean gotIt = false;

    public static void main(String[] args) {
        System.out.print("Welcome! What is your name?");
        String name = sc.next();
        System.out.println("Hello " + name + "! Let's practice your Spanish conjugations!");
        beginGame();
    }

    public static void beginGame() {
        do {
            gotIt = false;
            System.out.println(c.getVerb());
            
            do {
                userInput = sc.next();
                if (c.check(userInput)) {
                    System.out.println("Nice job!");
                    gotIt = true;
                } else {
                    System.out.println("Try again :( ");
                }
            } while (gotIt != true);
            
            
            System.out.print("Again? ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));
    }
}