package homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the first number: ");
        a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        b = scanner.nextInt();

        System.out.println("Enter the third number: ");
        c = scanner.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest number is " + max);

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min){
            c = min;
        }
        System.out.println("The smallest number out of three is " +min);

        int mid = a;
        if (b < max && b > min) {
            mid = b;
        }
        if (c < max && c > max) {
            mid = c;
        }
        System.out.println("This is the average: " +mid);
        System.out.println("Maximum number of three numbers: " + max + "" +mid + "" +min);

    }
}



