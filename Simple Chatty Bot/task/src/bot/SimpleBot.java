package bot;

import org.hamcrest.core.IsCollectionContaining;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        String botName = scanner.nextLine().trim();
        System.out.println("What a great name you have, "+botName+" !");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        // reading all remainders
        int yourAge= (rem3*70+rem5*21+rem7*50)%105;

        System.out.println("Your age is "+yourAge+"; that's a good time to start programming!");
    }
}
