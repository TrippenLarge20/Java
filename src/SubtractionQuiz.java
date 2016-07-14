/**
 * Created by student on 7/13/2016.
 */
import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[]args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 - number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong\n" + number1 + " - " + number2 + " is " + (number1 - number2));
    }
}
