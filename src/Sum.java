/**
 * Created by student on 7/14/2016.
 */
public class Sum {
    public static int sum(int i1, int i2) {
        int result = 0;
        for ( int i = i1; i <=i2; i++)
            result += i;

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum form 1 to 10 is " + sum(1, 10));
        System.out.println("Sum form 20 to 37 is " + sum(20,37));
        System.out.println("Sum from 35 to 49 is " + sum(35, 49));
    }
}
