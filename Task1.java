package homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int isEdekaOpen = 8;
        int isEdekaClose = 16;
        int isReweOpen = 12;
        int isReweClose = 23;
        Scanner scanner = new Scanner(System.in);
           System.out.println("What time is it?");
           int hour = scanner.nextInt();
           if (hour > isReweClose || hour < isEdekaOpen){
            System.out.println("All shops are close");
        }else{
               System.out.println("I can buy food in : \n"
               +"isEdekaOpen: " +canBuyEdeka(isEdekaOpen, isEdekaClose, hour)
                       +"\nisReweOpen: "+canBuyRewe(isReweOpen, isReweClose, hour));
           }
    }
    static boolean canBuyEdeka(int isEdekaOpen, int isEdekaClose, int hour){
        if(hour < isEdekaClose && hour >= isEdekaOpen){

            return true;

        }else{
            return false;
        }
    }



    static boolean canBuyRewe(int isReweOpen, int isReweClose, int hour){
        if(hour < isReweClose && hour >= isReweOpen){
            return true;

        }else{
            return false;
        }
    }
}
____________________________________________________________________________



        package homework;

        import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear = isLeap(year);

        if (isLeapYear) {
            System.out.println(year + " - високосный год ");
        }else {
            System.out.println(year + "- не високосный год ");
        }
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
______________________________________________________________________________

        

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


