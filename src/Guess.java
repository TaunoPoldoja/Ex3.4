/**
 * Created by tauno on 13.11.2016.
 */
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        //class variables
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // data variables
        int number = random.nextInt(100) + 1;
        int userNumber;
        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is? ");

        System.out.printf("Type a number ");
        userNumber = input.nextInt();

        if (userNumber == number) {
            System.out.printf("Geat, same number !");

        } else {
            System.out.printf("Your guess is: %d" +"\n" + "The number I was thinking of is %d"+"\n" +"You were off by: %d", userNumber, number, userNumber - number);


        }
    }
}
