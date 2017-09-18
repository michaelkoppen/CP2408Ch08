/**
 * Created by jc428209 on 18/09/17.
 */
import java.util.Scanner;
public class TwelveInts {
    public static void main(String[] args) {
        int[] integerArray = new int[12];
        Scanner input = new Scanner(System.in);
        for(int x = 0; x < 12; x++) {
            System.out.println("Enter an integer");
            int newInteger = input.nextInt();
            integerArray[x] = newInteger;
        }

        for(int x : integerArray) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        for(int x = 11; x >= 0; x--) {
            System.out.print(integerArray[x] + " ");
        }
        }
    }

