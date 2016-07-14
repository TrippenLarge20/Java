/**
 * Created by student on 7/14/2016.
 */
import javax.swing.*;
public class IHopeThisWorks {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter the name of your adventurer: ");

        JOptionPane.showMessageDialog(null, "Hello " + name + ", to begin the adventure, click 'OK'. ");

        JOptionPane.showConfirmDialog(null, "The path ahead is dangerous, are you sure you wish to procede?",
                "Warning!!!", JOptionPane.WARNING_MESSAGE);

        String choice1 = JOptionPane.showInputDialog(null, "You are standing outside a cave. You are currently facing south. What do you do?");
         {
            switch (choice1) {
                case "Enter cave":
                    JOptionPane.showMessageDialog(null, "You die");
                    break;

                case "Go north":
                    JOptionPane.showMessageDialog(null, "You die.");
                    break;
                case "Go east":
                    JOptionPane.showMessageDialog(null, "You die.");
                    break;
                case "Go south":
                    JOptionPane.showMessageDialog(null, "You die.");
                    break;
                case "Go west":
                    JOptionPane.showMessageDialog(null, "You die.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You die."); break;
            }
        }
        }
    }

