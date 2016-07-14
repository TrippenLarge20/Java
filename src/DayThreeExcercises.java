/**
 * Created by student on 7/13/2016.
 */
import java.util.Scanner;
public class DayThreeExcercises {
    public static void main(String[]args) {
        //Step 1: Randomly generate heads or tails.
        int coin = (int)(Math.random() * 2);

        //Step 2: Ask user for input
        System.out.print("Please guess 0 for tails, or 1 for heads: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        //Step 3: Show the result
        if (coin == 0)
            System.out.println("Tails");
        else
            System.out.println("Heads");
        if (guess == coin)
            System.out.println("Hooray! You're right!");
        else
            System.out.println("Try Again.");

    }
}
