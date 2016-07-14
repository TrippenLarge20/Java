/**
 * Created by student on 7/14/2016.
 */
import java.util.Scanner;
import javax.swing.*;
public class GuessNumber {
    public static void main(String[]args) {
        int number = (int)(Math.random() *101);
        JOptionPane.showMessageDialog(null, "Guess a number between 0 and 100.");
        int guess = -1;
        int attempt = 0;
        while (guess != number) {
            attempt++;
            String input = JOptionPane.showInputDialog(null, "Guess a number between 0 and 100.", "Attempt number: " + attempt, JOptionPane.INFORMATION_MESSAGE);
            guess = Integer.parseInt(input);
            if (guess > number) {
                JOptionPane.showMessageDialog(null, "Wrong! Your guess is too high.");
            }
            else if (guess < number) {
                JOptionPane.showMessageDialog(null, "Wrong! Your guess is too low.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Correct! The magic number is " + number +"! ", "Attemps: " + attempt, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
