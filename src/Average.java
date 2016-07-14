/**
 * Created by student on 7/12/2016.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        //Step 1: Get user input with JOptionPane
        String input = JOptionPane.showInputDialog(null, "Enter the first number:", "Calculate Average",
                                                    JOptionPane.INFORMATION_MESSAGE);
        //Step 2: Get user input

        double number1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the second number:", "Calculate Average",
                JOptionPane.INFORMATION_MESSAGE);
        double number2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the third number:", "Calculate Average",
                JOptionPane.INFORMATION_MESSAGE);
        double number3 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the fourth number:", "Calculate Average",
                JOptionPane.INFORMATION_MESSAGE);
        double number4 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter the fifth number:", "Calculate Average",
                JOptionPane.INFORMATION_MESSAGE);
        double number5 = Double.parseDouble(input);
        //Step 3: Calculate Average
        double average = (number1 + number2 + number3 + number4 + number5 )/5;
        //Step 4: Display the result
        javax.swing.JOptionPane.showMessageDialog(null,"The average of " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", and " + number5 + " is " + average);

    }
}
