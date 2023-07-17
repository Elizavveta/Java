import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите первую строку: ");
        String a = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        String b = sc.nextLine();
        System.out.println(a.substring(0, a.length() / 2) + b.substring(b.length() / 2));
    }
}

______________________________________________________________

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите ыторое число: ");
        int num2 = scanner.nextInt();

        int sum = addition(num1, num2);
        System.out.println("Сумма: " + sum);

        int diff = subtraction(num1, num2);
        System.out.println("Разность: " + diff);

        int product = multiplication(num1, num2);
        System.out.println("Произведение: " + product);

        double quotient = division(num1, num2);
        System.out.println("Частное: " + quotient);

    }

    private static double division(int a, int b) {
        if (b==0)  new Exception("Вы не можете делить на ноль");
        return a / b;
    }


    private static int multiplication(int a, int b) {

        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int addition(int a, int b) {
        return a + b;
    }

}

