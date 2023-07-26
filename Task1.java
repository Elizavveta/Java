package hw07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру первой колбы ");
        int temperature1 = scanner.nextInt();

        System.out.println("Ведите ткмпературу второй колбы ");
        int temperature2 = scanner.nextInt();

        boolean isDevaiveWorking = isDeviceCorrect(temperature1, temperature2);

        if (isDevaiveWorking) {
            System.out.println("Устройство работает верно!");
        }else{
            System.out.println("Устройство работает не верно!");
        }
    }

    private static boolean isDeviceCorrect(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
}
