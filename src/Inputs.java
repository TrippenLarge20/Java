/**
 * Created by student on 7/12/2016.
 */
import java.util.Scanner;
public class Inputs {
    public static  void main (String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area for a circle of radius " + radius + " is " + area);
    }
}
