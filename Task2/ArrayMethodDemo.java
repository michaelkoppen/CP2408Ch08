import java.util.Scanner;

/**
 * Created by jc428209 on 18/09/17.
 */
public class ArrayMethodDemo {
    public static void main(String[] args) {

        int[] integerArray = new int[12];
        for(int x = 0; x < 12; x++) {
            integerArray[x] = x;
        }
        displayArray(integerArray);
        System.out.println("");
        displayArrayReverse(integerArray);
        System.out.println("");
        displaySum(integerArray);
        System.out.println("");
        displayLesser(integerArray);
        System.out.println("");
        displayHigher(integerArray);
    }

    static void displayArray(int []integerArray) {
        for(int x : integerArray) {
            System.out.print(x + " ");
        }
    }

    static void displayArrayReverse(int[] integerArray) {
        for(int x = 11; x >= 0; x--) {
            System.out.print(integerArray[x] + " ");
        }
    }

    static void displaySum(int[] integerArray) {
        int sum = 0;
        for(int x : integerArray) {
            sum += x;
        }
        System.out.print(sum);
    }

    static void displayLesser(int[] integerArray) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number >> ");
        int userInput = input.nextInt();
        for(int x : integerArray) {
            if(x < userInput) {
                System.out.print(x + " ");
            }
        }
    }

    static void displayHigher(int[] integerArray) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number >> ");
        int userInput = input.nextInt();
        for(int x : integerArray) {
            if(x > userInput) {
                System.out.print(x + " ");
            }
        }
    }
}
